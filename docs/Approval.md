
# Approval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique identifier for the approval returned by the system. | 
**appUser** | [**AppUser**](AppUser.md) |  | 
**status** | **StatusEnum** | The approval status. | 
**parentEmail** | **String** | Email of the parent who received this request. |  [optional]
**parentMobilePhone** | **String** | Phone number of the parent who received this request. The format should be XXXYYYZZZZ (no dashes or parentheses). |  [optional]
**currentState** | **CurrentStateEnum** | Current state of the approval. |  [optional]



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



