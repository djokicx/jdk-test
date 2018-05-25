# saferize-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.saferize:saferize-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AppApi;

import java.io.File;
import java.util.*;

public class AppApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: BearerAuth
        HttpBasicAuth BearerAuth = (HttpBasicAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setUsername("YOUR USERNAME");
        BearerAuth.setPassword("YOUR PASSWORD");
        
        

        AppApi apiInstance = new AppApi();
        
        Object body = ; // Object | App fields to be updated.
        
        Long id = Arrays.asList(789L); // Long | The identifier of the app to retrieve.
        
        try {
            App result = apiInstance.changeAppAttributes(body, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#changeAppAttributes");
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
 - [AppConfig](docs/AppConfig.md)
 - [AppFeature](docs/AppFeature.md)
 - [AppFeatureName](docs/AppFeatureName.md)
 - [AppUsageSession](docs/AppUsageSession.md)
 - [AppUser](docs/AppUser.md)
 - [Approval](docs/Approval.md)
 - [Child](docs/Child.md)
 - [Developer](docs/Developer.md)
 - [Error](docs/Error.md)
 - [Family](docs/Family.md)
 - [ImageUpload](docs/ImageUpload.md)
 - [JsonPatch](docs/JsonPatch.md)
 - [Parent](docs/Parent.md)
 - [Session](docs/Session.md)
 - [SubscriptionPlan](docs/SubscriptionPlan.md)
 - [Validator](docs/Validator.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerAuth


- **Type**: HTTP authentication





## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devs@saferize.com

