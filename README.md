# saferize-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.saferize</groupId>
    <artifactId>saferize-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.saferize:saferize-java-client:1.0.0"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.saferize.client.*;
import com.saferize.client.auth.*;
import com.saferize.client.model.*;
import com.saferize.client.api.AppApi;

import java.io.File;
import java.util.*;

public class AppApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure authorization: Bearer
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        bearerAuth.setPrivateKeyFromPEM("src/main/resources/private_key.pem");
        bearerAuth.setApiKey("4a98ed10-3492-43b2-b3d6-545d988b64f2");
        
        ApprovalApi api = new ApprovalApi();
        
		try {
		    Approval result = apiInstance.initiateApproval("parent@email.com", "username");
		    System.out.println(result);
		} catch (ApiException e) {
		    System.err.println("Exception when calling initiateApproval");
		    e.printStackTrace();
		}
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.saferize.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApprovalApi* | [**getApprovalById**](docs/ApprovalApi.md#getApprovalById) | **GET** /approval/{id} | Retrieve an Approval via identifier
*ApprovalApi* | [**getApprovalByToken**](docs/ApprovalApi.md#getApprovalByToken) | **GET** /approval/token/{token} | Retrieve an Approval via token
*ApprovalApi* | [**getApprovals**](docs/ApprovalApi.md#getApprovals) | **GET** /approval | List App approvals
*ApprovalApi* | [**initiateApproval**](docs/ApprovalApi.md#initiateApproval) | **POST** /approval | Initiate an Approval
*SessionApi* | [**createAppUserSession**](docs/SessionApi.md#createAppUserSession) | **POST** /session/app/{token} | Create an app user session


## Documentation for Models

 - [App](docs/App.md)
 - [AppUsageSession](docs/AppUsageSession.md)
 - [AppUser](docs/AppUser.md)
 - [Approval](docs/Approval.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerAuth
Read more about [JWT Tokens](https://jwt.io/introduction/).

- **Type**: HTTP authentication


## Author

devs@saferize.com

