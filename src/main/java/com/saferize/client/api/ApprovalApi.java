package com.saferize.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.saferize.client.ApiResponse;
import com.saferize.client.Pair;
import com.saferize.client.SaferizeApiException;
import com.saferize.client.model.Approval;


public class ApprovalApi extends SaferizeApi{

    public ApprovalApi() {
        super();
    }
    
    /**
     * Retrieve an Approval via identifier
     * 
     * @param id Unique identifier for the approval. (required)
     * @return Approval
     * @throws SaferizeApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public Approval getApprovalById(Long id) throws SaferizeApiException {
        ApiResponse<Approval> resp = getApprovalByIdWithHttpInfo(id);
        return resp.getData();
    }
    
    private com.squareup.okhttp.Call getApprovalByIdCall(Long id) throws SaferizeApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/approval/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                ACCEPT_HEADER
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);



        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }
    
    private com.squareup.okhttp.Call getApprovalByIdValidateBeforeCall(Long id) throws SaferizeApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new SaferizeApiException("Missing the required parameter 'id' when calling getApprovalById()");
        }
        
        
        com.squareup.okhttp.Call call = getApprovalByIdCall(id);
        return call;
    }

    private ApiResponse<Approval> getApprovalByIdWithHttpInfo(Long id) throws SaferizeApiException {
        com.squareup.okhttp.Call call = getApprovalByIdValidateBeforeCall(id);
        Type localVarReturnType = new TypeToken<Approval>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an Approval via token
     * 
     * @param token The unique token assigned by the app to the user. (required)
     * @return Approval
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public Approval getApprovalByToken(String token) throws SaferizeApiException {
        ApiResponse<Approval> resp = getApprovalByTokenWithHttpInfo(token);
        return resp.getData();
    }
    
    private com.squareup.okhttp.Call getApprovalByTokenCall(String token) throws SaferizeApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/approval/token/{token}"
            .replaceAll("\\{" + "token" + "\\}", apiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                ACCEPT_HEADER
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);



        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }
    
    private com.squareup.okhttp.Call getApprovalByTokenValidateBeforeCall(String token) throws SaferizeApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new SaferizeApiException("Missing the required parameter 'token' when calling getApprovalByToken()");
        }
        
        
        com.squareup.okhttp.Call call = getApprovalByTokenCall(token);
        return call;
    }
    
    private ApiResponse<Approval> getApprovalByTokenWithHttpInfo(String token) throws SaferizeApiException {
        com.squareup.okhttp.Call call = getApprovalByTokenValidateBeforeCall(token);
        Type localVarReturnType = new TypeToken<Approval>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    /**
     * List App approvals
     * Retrieves all the approvals associated with the app.
     * @return List
     * @throws SaferizeApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public List<Approval> getApprovals() throws SaferizeApiException {
        ApiResponse<List<Approval>> resp = getApprovalsWithHttpInfo();
        return resp.getData();
    }
    
    private com.squareup.okhttp.Call getApprovalsCall() throws SaferizeApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/approval";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                ACCEPT_HEADER
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);



        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }
    
    private com.squareup.okhttp.Call getApprovalsValidateBeforeCall() throws SaferizeApiException {
        
        com.squareup.okhttp.Call call = getApprovalsCall();
        return call;
    }

    private ApiResponse<List<Approval>> getApprovalsWithHttpInfo() throws SaferizeApiException {
        com.squareup.okhttp.Call call = getApprovalsValidateBeforeCall();
        Type localVarReturnType = new TypeToken<List<Approval>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    
    /**
     * Initiate an Approval
     * A new approval object is created in order to get parent consent to add a new app user (a child).  Your app will be able to initiate approvals once it is pu lished. To learn more about setting up your app, please read our [Quick Start Guide](http://saferize.com/guides/quickstart_landing.html).
     * @param body The new Approval (required)
     * @return Approval
     * @throws SaferizeApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public Approval initiateApproval(String parentEmail, String token) throws SaferizeApiException {
        ApiResponse<Approval> resp = initiateApprovalWithHttpInfo(parentEmail, token);
        return resp.getData();
    }
    
    private ApiResponse<Approval> initiateApprovalWithHttpInfo(String parentEmail, String childUsername) throws SaferizeApiException {
        com.squareup.okhttp.Call call = initiateApprovalValidateBeforeCall(parentEmail, childUsername);
        Type localVarReturnType = new TypeToken<Approval>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    private com.squareup.okhttp.Call initiateApprovalValidateBeforeCall(String parentEmail, String childUsername) throws SaferizeApiException {
        if (parentEmail == null) {
            throw new SaferizeApiException("Missing the required parameter parentEmail in the 'body' when calling initiateApproval()");
        }
        if (childUsername == null) {
            throw new SaferizeApiException("Missing the required parameter childUsername in the 'body' when calling initiateApproval()");
        }
        
        
        com.squareup.okhttp.Call call = initiateApprovalCall(parentEmail, childUsername);
        return call;
    }
    
    private com.squareup.okhttp.Call initiateApprovalCall(String parentEmail, String childUsername) throws SaferizeApiException {
        JsonObject localVarPostBody = new JsonObject();
        
        localVarPostBody.add("user", new JsonObject());
        localVarPostBody.add("parent", new JsonObject());

        localVarPostBody.get("parent").getAsJsonObject().addProperty("email", parentEmail);
        localVarPostBody.get("user").getAsJsonObject().addProperty("token", childUsername);
        
        
        // create path and map variables
        String localVarPath = "/approval";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                ACCEPT_HEADER
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);



        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }
}