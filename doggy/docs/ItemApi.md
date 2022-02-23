# ItemApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppItemGet**](ItemApi.md#apiAppItemGet) | **GET** /api/app/item | 
[**apiAppItemIdDelete**](ItemApi.md#apiAppItemIdDelete) | **DELETE** /api/app/item/{id} | 
[**apiAppItemIdGet**](ItemApi.md#apiAppItemIdGet) | **GET** /api/app/item/{id} | 
[**apiAppItemIdPut**](ItemApi.md#apiAppItemIdPut) | **PUT** /api/app/item/{id} | 
[**apiAppItemPost**](ItemApi.md#apiAppItemPost) | **POST** /api/app/item | 
[**apiAppItemSpecialItemsGet**](ItemApi.md#apiAppItemSpecialItemsGet) | **GET** /api/app/item/special-items | 


<a name="apiAppItemGet"></a>
# **apiAppItemGet**
> ItemDtoPagedResultDto apiAppItemGet(parentItemId, searchKey, name, types, extension, contentType, tagId, maxResultCount, sorting, skipCount)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
val parentItemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val searchKey : kotlin.String = searchKey_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val types : kotlin.collections.List<ItemType> =  // kotlin.collections.List<ItemType> | 
val extension : kotlin.String = extension_example // kotlin.String | 
val contentType : kotlin.String = contentType_example // kotlin.String | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val maxResultCount : kotlin.Int = 56 // kotlin.Int | 
val sorting : kotlin.String = sorting_example // kotlin.String | 
val skipCount : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : ItemDtoPagedResultDto = apiInstance.apiAppItemGet(parentItemId, searchKey, name, types, extension, contentType, tagId, maxResultCount, sorting, skipCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentItemId** | **java.util.UUID**|  | [optional]
 **searchKey** | **kotlin.String**|  | [optional]
 **name** | **kotlin.String**|  | [optional]
 **types** | [**kotlin.collections.List&lt;ItemType&gt;**](ItemType.md)|  | [optional]
 **extension** | **kotlin.String**|  | [optional]
 **contentType** | **kotlin.String**|  | [optional]
 **tagId** | **java.util.UUID**|  | [optional]
 **maxResultCount** | **kotlin.Int**|  | [optional]
 **sorting** | **kotlin.String**|  | [optional]
 **skipCount** | **kotlin.Int**|  | [optional]

### Return type

[**ItemDtoPagedResultDto**](ItemDtoPagedResultDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppItemIdDelete"></a>
# **apiAppItemIdDelete**
> apiAppItemIdDelete(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiAppItemIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppItemIdGet"></a>
# **apiAppItemIdGet**
> ItemDto apiAppItemIdGet(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ItemDto = apiInstance.apiAppItemIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**ItemDto**](ItemDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppItemIdPut"></a>
# **apiAppItemIdPut**
> ItemDto apiAppItemIdPut(id, createUpdateItemDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createUpdateItemDto : CreateUpdateItemDto =  // CreateUpdateItemDto | 
try {
    val result : ItemDto = apiInstance.apiAppItemIdPut(id, createUpdateItemDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createUpdateItemDto** | [**CreateUpdateItemDto**](CreateUpdateItemDto.md)|  | [optional]

### Return type

[**ItemDto**](ItemDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppItemPost"></a>
# **apiAppItemPost**
> ItemDto apiAppItemPost(createUpdateItemDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
val createUpdateItemDto : CreateUpdateItemDto =  // CreateUpdateItemDto | 
try {
    val result : ItemDto = apiInstance.apiAppItemPost(createUpdateItemDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUpdateItemDto** | [**CreateUpdateItemDto**](CreateUpdateItemDto.md)|  | [optional]

### Return type

[**ItemDto**](ItemDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppItemSpecialItemsGet"></a>
# **apiAppItemSpecialItemsGet**
> SpecialItemDto apiAppItemSpecialItemsGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ItemApi()
try {
    val result : SpecialItemDto = apiInstance.apiAppItemSpecialItemsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemApi#apiAppItemSpecialItemsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemApi#apiAppItemSpecialItemsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SpecialItemDto**](SpecialItemDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

