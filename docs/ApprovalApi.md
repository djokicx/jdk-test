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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApprovalApi;



ApprovalApi apiInstance = new ApprovalApi();

Long id = Arrays.asList(789L); // Long | Unique identifier for the approval.

try {
    Approval result = apiInstance.getApprovalById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalApi#getApprovalById");
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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApprovalApi;



ApprovalApi apiInstance = new ApprovalApi();

Long token = Arrays.asList(789L); // Long | The unique token assigned by the app to the user.

try {
    Approval result = apiInstance.getApprovalByToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalApi#getApprovalByToken");
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
> List getApprovals()

List App approvals

Retrieves all the approvals associated with the app.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApprovalApi;



ApprovalApi apiInstance = new ApprovalApi();

try {
    List result = apiInstance.getApprovals();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalApi#getApprovals");
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
> Approval initiateApproval(body)

Initiate an Approval

A new approval object is created in order to get parent consent to add a new app user (a child).  Your app will be able to initiate approvals once it is pu lished. To learn more about setting up your app, please read our [Quick Start Guide](http://google.com).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApprovalApi;



ApprovalApi apiInstance = new ApprovalApi();

Object body = ; // Object | The new Approval

try {
    Approval result = apiInstance.initiateApproval(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApprovalApi#initiateApproval");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The new Approval |


### Return type

[**Approval**](Approval.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



