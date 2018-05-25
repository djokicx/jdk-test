package com.saferize.client.auth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;



public class KeyIO {
    
    public RSAPrivateKey readBytes(InputStream stream) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        byte[] encKey = new byte[stream.available()];  
        stream.read(encKey);

        stream.close();
        
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(encKey);
        
        KeyFactory kf = KeyFactory.getInstance("RSA");
        RSAPrivateKey pk = (RSAPrivateKey) kf.generatePrivate(pkcs8EncodedKeySpec);
        
        return pk;
    }
    
    public RSAPrivateKey readBytesFromFile(String resource) throws IOException, InvalidKeySpecException, NoSuchAlgorithmException {
        FileInputStream keyfis = new FileInputStream(resource);
        return readBytes(keyfis);
    }
    
    public RSAPrivateKey readPem(String resource) throws IOException, GeneralSecurityException {
        String privateKeyPEM = getKey(resource);
        return getPrivateKeyFromString(privateKeyPEM);
    }
    
    // private
    
    private String getKey(String filename) throws IOException {
        // Read key from file
        String strKeyPEM = "";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            strKeyPEM += line + "\n";
        }
        br.close();
        return strKeyPEM;
    }

    private RSAPrivateKey getPrivateKeyFromString(String key) throws IOException, GeneralSecurityException {
        String privateKeyPEM = key;
        privateKeyPEM = privateKeyPEM.replace("-----BEGIN PRIVATE KEY-----\n", "");
        privateKeyPEM = privateKeyPEM.replace("-----END PRIVATE KEY-----", "");
        byte[] encoded = Base64.getMimeDecoder().decode(privateKeyPEM);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
        RSAPrivateKey privKey = (RSAPrivateKey) kf.generatePrivate(keySpec);
        return privKey;
    }
    
}
