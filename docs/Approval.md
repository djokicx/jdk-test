
# Approval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique identifier for the approval returned by the system. | 
**appUser** | [**AppUser**](AppUser.md) |  | 
**statusTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time and date of the last status change. The date-time notation as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339). | 
**createdTime** | [**OffsetDateTime**](OffsetDateTime.md) | Time and date when this approval was created. The date-time notation as defined by [RFC 3339](https://tools.ietf.org/html/rfc3339). | 
**status** | [**StatusEnum**](/#StatusEnum) | The approval status. | 
**parentEmail** | **String** | Email of the parent who received this request. |  [optional]
**parentMobilePhone** | **String** | Phone number of the parent who received this request. The format should be XXXYYYZZZZ (no dashes or parentheses). |  [optional]
**currentState** | [**CurrentStateEnum**](/#CurrentStateEnum) | Current state of the approval. |  [optional]



<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
NOTIFIED | &quot;NOTIFIED&quot;
APPROVED | &quot;APPROVED&quot;
REJECTED | &quot;REJECTED&quot;


<a name="CurrentStateEnum"></a>
## Enum: CurrentStateEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
PAUSED | &quot;PAUSED&quot;



