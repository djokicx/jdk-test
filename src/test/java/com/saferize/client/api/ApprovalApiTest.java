


package com.saferize.client.api;

import static org.junit.Assert.*;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.saferize.client.ApiClient;
import com.saferize.client.SaferizeApiException;
import com.saferize.client.Configuration;
import com.saferize.client.api.ApprovalApi;
import com.saferize.client.auth.HttpBearerAuth;
import com.saferize.client.model.Approval;


/**
 * API tests for ApprovalApi
 */

//@Ignore
public class ApprovalApiTest {

    private static ApprovalApi api;
    
    @BeforeClass
    public static void setup() throws IOException, GeneralSecurityException {
        
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure authorization: Bearer
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        bearerAuth.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
        bearerAuth.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");
        
        api = new ApprovalApi();
        
    }
    
    /**
     * Retrieve an Approval via identifier
     *
     * @throws SaferizeApiException
     *          if the Api call fails
     */
    @Test
    public void getApprovalByIdTest() throws SaferizeApiException {
        String parentEmail = String.format("testParent%tQ@saferize.com", new Date());
        String childUsername = String.format("testChildToken%tQ", new Date());
        
        Approval approvalInit = api.initiateApproval(parentEmail, childUsername);
        Approval approvalId = api.getApprovalById(approvalInit.getId());
        assertTrue(approvalInit.equals(approvalId));
    }
    
    /**
     * Retrieve an Approval via token
     *
     * @throws SaferizeApiException
     *          if the Api call fails
     */
    @Test
    public void getApprovalByTokenTest() throws SaferizeApiException {
        String parentEmail = String.format("testParent%tQ@saferize.com", new Date());
        String childUsername = String.format("testChildToken%tQ", new Date());
        
        Approval approvalInit = api.initiateApproval(parentEmail, childUsername);
        Approval approvalTok = api.getApprovalByToken(approvalInit.getAppUser().getToken());
        assertTrue(approvalInit.equals(approvalTok));
    }
    
    /**
     * List App approvals
     *
     * @throws SaferizeApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void getApprovalsTest() throws SaferizeApiException {
        String parentEmail = String.format("testParent%tQ@saferize.com", new Date());
        String childUsername = String.format("testChildToken%tQ", new Date());
        
        api.initiateApproval(parentEmail, childUsername);
        
        List<Approval> approvals = api.getApprovals();

        assertTrue(approvals.size() > 0);
    }
    
    /**
     * Initiate an Approval
     *
     * @throws SaferizeApiException
     *          if the Api call fails
     */
    @Test
    public void initiateApprovalTest() throws SaferizeApiException {
        String parentEmail = String.format("testParent%tQ@saferize.com", new Date());
        String childUsername = String.format("testChildToken%tQ", new Date());
        
        Approval approval = api.initiateApproval(parentEmail, childUsername);
        
        assertTrue(approval.getParentEmail().equals(parentEmail));
        assertTrue(approval.getAppUser().getToken().equals(childUsername));
    }
    
}
