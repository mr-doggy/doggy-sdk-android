
# TodoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**creationTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**creatorId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**lastModificationTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**lastModifierId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**isDeleted** | **kotlin.Boolean** |  |  [optional]
**deleterId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional]
**deletionTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**title** | **kotlin.String** |  |  [optional]
**priority** | [**Priority**](Priority.md) |  |  [optional]
**tags** | [**kotlin.collections.List&lt;TagDto&gt;**](TagDto.md) |  |  [optional]
**doneAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**isDone** | **kotlin.Boolean** |  |  [optional]
**children** | [**kotlin.collections.List&lt;TodoDto&gt;**](TodoDto.md) |  |  [optional]



