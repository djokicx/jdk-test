# SessionApi

All URIs are relative to *http://api.saferize.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppUserSession**](SessionApi.md#createAppUserSession) | **POST** /session/app/{token} | Create an app user session



<a name="createAppUserSession"></a>
# **createAppUserSession**
> AppUsageSession createAppUserSession(token)

Create an app user session

### Example
```java
// Import classes:
//import com.saferize.client.SaferizeApiException;
//import com.saferize.client.api.ApprovalApi;

ApiClient client = new ApiClient();

client.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
client.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");

SessionApi apiInstance = new SessionApi(client);

try {
    AppUsageSession result = apiInstance.createAppUserSession("username");
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling createAppUserSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Unique username (alias) for the app user on the app. |


### Return type

[**AppUsageSession**](AppUsageSession.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json
 
