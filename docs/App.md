
# App

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique identifier for the app returned by the system. | 
**name** | **String** | Name of the app. | 
**platforms** | **List&lt;String&gt;** | Array of enums that specify what platforms are supported by this app. |  [optional]
**category** | **CategoryEnum** | One of the predefined values indicating the category of the app. |  [optional]
**timeRestriction** | **TimeRestrictionEnum** | On/off flag for enabling/disabling time restrictions on the app. |  [optional]
**status** | **StatusEnum** | Current lifecycle status of the app. Please read more on the requirements for [publishing the app]. |  [optional]
**description** | **String** | Description of the app. (max. number of characters &#x3D; 255) |  [optional]
**shortDescription** | **String** | Short description of the app. (max. number of characters &#x3D; 100) |  [optional]
**urlName** | **String** | Partial url name of this app on Saferize. |  [optional]
**age** | **Long** | Minimum recommended age of app users. |  [optional]
**email** | **String** | App developer's email. |  [optional]



<a name="CategoryEnum"></a>
## Enum: CategoryEnum
Name | Value
---- | -----
GAME | &quot;GAME&quot;
MEDIA | &quot;MEDIA&quot;


<a name="TimeRestrictionEnum"></a>
## Enum: TimeRestrictionEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
DRAFT | &quot;DRAFT&quot;
PUBLISHED | &quot;PUBLISHED&quot;
DELETED | &quot;DELETED&quot;



