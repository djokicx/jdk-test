


package com.saferize.client.api;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.saferize.client.SaferizeApiException;
import com.saferize.client.ApiResponse;
import com.saferize.client.Pair;
import com.saferize.client.model.AppUsageSession;



public class SessionApi extends SaferizeApi {

    public SessionApi() {
        super();
    }
    
    /**
     * Create an app user session
     * 
     * @param token Unique username (alias) for the app user on the app. (required)
     * @return AppUsageSession
     * @throws SaferizeApiException If fail to call the API, e.g. server error or cannot deserialize the response body
        
     */
    public AppUsageSession createAppUserSession(String token) throws SaferizeApiException {
        ApiResponse<AppUsageSession> resp = createAppUserSessionWithHttpInfo(token);
        return resp.getData();
    }
    
    private com.squareup.okhttp.Call createAppUserSessionCall(String token) throws SaferizeApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/session/app/{token}"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames);
    }
    
    private com.squareup.okhttp.Call createAppUserSessionValidateBeforeCall(String token) throws SaferizeApiException {
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new SaferizeApiException("Missing the required parameter 'token' when calling createAppUserSession()");
        }
        
        
        com.squareup.okhttp.Call call = createAppUserSessionCall(token);
        return call;
    }

    private ApiResponse<AppUsageSession> createAppUserSessionWithHttpInfo(String token) throws SaferizeApiException {
        com.squareup.okhttp.Call call = createAppUserSessionValidateBeforeCall(token);
        Type localVarReturnType = new TypeToken<AppUsageSession>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
}