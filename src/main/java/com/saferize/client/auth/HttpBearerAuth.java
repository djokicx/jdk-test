package com.saferize.client.auth;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class HttpBearerAuth implements Authentication {
    private final KeyIO keyIO;
    private static final String BEARER = "Bearer ";

    public HttpBearerAuth() {
         keyIO = new KeyIO();
    }
    
    private RSAPrivateKey pk;
    private String apiKey;
    

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public RSAPrivateKey getPrivateKey() {
        return pk;
    }

    public void setPrivateKey(RSAPrivateKey pk) {
        this.pk = pk;
    }
    
    public void setPrivateKeyFromInputStream(InputStream stream) throws InvalidKeySpecException, NoSuchAlgorithmException, IOException {
        setPrivateKey(keyIO.readBytes(stream));
    }
    
    public void setPrivateKeyFromPEM(String resource) throws IOException, GeneralSecurityException {
        setPrivateKey(keyIO.readPem(resource));
    }
    
    private String generateJWT() {
        return JWT.create().withAudience("https://saferize.com/principal")
                .withSubject(apiKey)
                .withExpiresAt(Date.from(ZonedDateTime.now(ZoneOffset.UTC).plusSeconds(30).toInstant()))
                .sign(Algorithm.RSA256(null, pk));
        
    }

    @Override
    public void applyToParams(Map<String, String> headerParams) {
        if (pk == null) {
            return;
        }
        if (apiKey == null) {
            return;
        }
        headerParams.put("Authorization", BEARER + generateJWT());
    }
}
