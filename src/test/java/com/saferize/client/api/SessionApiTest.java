package com.saferize.client.api;

import static org.junit.Assert.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.saferize.client.ApiClient;
import com.saferize.client.SaferizeApiException;
import com.saferize.client.auth.HttpBearerAuth;
import com.saferize.client.model.AppUsageSession;
import com.saferize.client.model.Approval;


/**
 * API tests for SessionApi
 */
@Ignore
public class SessionApiTest {

    private static SessionApi sessionApi;
    private static ApprovalApi approvalApi;
    
    @BeforeClass
    public static void setup() throws IOException, GeneralSecurityException {
        
        ApiClient client = new ApiClient();
        
        // Configure authorization: Bearer
        HttpBearerAuth bearerAuth = (HttpBearerAuth) client.getAuthentication("Bearer");
        bearerAuth.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
        bearerAuth.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");
        
        
        approvalApi = new ApprovalApi(client);
        sessionApi = new SessionApi(client);
    }
    
    /**
     * Create an app user session
     *
     * 
     *
     * @throws SaferizeApiException
     *          if the Api call fails
     */
    @Test
    public void createAppUserSessionTest() throws SaferizeApiException {
        String parentEmail = String.format("testParent%tQ@saferize.com", new Date());
        String childUsername = String.format("testChildToken%tQ", new Date());
        
        Approval approval = approvalApi.initiateApproval(parentEmail, childUsername);
        String token = approval.getAppUser().getToken();
        
        AppUsageSession response = sessionApi.createAppUserSession(token);
        assertTrue(response.getApproval().equals(approval));
    }
    

    
}
