# ApprovalApi

All URIs are relative to *http://api.saferize.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApprovalById**](ApprovalApi.md#getApprovalById) | **GET** /approval/{id} | Retrieve an Approval via identifier
[**getApprovalByToken**](ApprovalApi.md#getApprovalByToken) | **GET** /approval/token/{token} | Retrieve an Approval via token
[**getApprovals**](ApprovalApi.md#getApprovals) | **GET** /approval | List App approvals
[**initiateApproval**](ApprovalApi.md#initiateApproval) | **POST** /approval | Initiate an Approval




<a name="getApprovalById"></a>
# **getApprovalById**
> Approval getApprovalById(id)

Retrieve an Approval via identifier

### Example
```java
// Import classes:
//import com.saferize.client.SaferizeApiException;
//import com.saferize.client.api.ApprovalApi;

ApiClient client = new ApiClient();

client.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
client.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");

ApprovalApi apiInstance = new ApprovalApi(client);

try {
    Approval result = apiInstance.getApprovalById(667L);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling getApprovalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Unique identifier for the approval. |


### Return type

[**Approval**](Approval.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="getApprovalByToken"></a>
# **getApprovalByToken**
> Approval getApprovalByToken(token)

Retrieve an Approval via token

### Example
```java
// Import classes:
//import com.saferize.client.SaferizeApiException;
//import com.saferize.client.api.ApprovalApi;

ApiClient client = new ApiClient();

client.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
client.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");

ApprovalApi apiInstance = new ApprovalApi(client);

try {
    Approval result = apiInstance.getApprovalByToken("username");
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling getApprovalByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **Long**| The unique token assigned by the app to the user. |


### Return type

[**Approval**](Approval.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="getApprovals"></a>
# **getApprovals**
> List<Approval> getApprovals()

List App approvals

Retrieves all the approvals associated with the app.

### Example
```java
// Import classes:
//import com.saferize.client.SaferizeApiException;
//import com.saferize.client.api.ApprovalApi;

ApiClient client = new ApiClient();

client.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
client.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");

ApprovalApi apiInstance = new ApprovalApi(client);

try {
    List<Approval> result = apiInstance.getApprovals();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling getApprovals");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.


### Return type

[**List**](List.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


<a name="initiateApproval"></a>
# **initiateApproval**
> Approval initiateApproval(parentEmail, token)

Initiate an Approval

A new approval object is created in order to get parent consent to add a new app user (a child).  Your app will be able to initiate approvals once it is published.

### Example
```java
// Import classes:
//import com.saferize.client.SaferizeApiException;
//import com.saferize.client.api.ApprovalApi;

ApiClient client = new ApiClient();

client.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
client.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");

ApprovalApi apiInstance = new ApprovalApi(client);

try {
    Approval result = apiInstance.initiateApproval("parent@email.com", "username");
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling initiateApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**parentEmail** | **String**| Parent email specified when child registers. |
**token** | **String**| The unique token assigned by the app to the user. |


### Return type

[**Approval**](Approval.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



