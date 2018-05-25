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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;



SessionApi apiInstance = new SessionApi();

String token = Arrays.asList("token_example"); // String | Unique username (alias) for the app user on the app.

try {
    AppUsageSession result = apiInstance.createAppUserSession(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#createAppUserSession");
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
 
