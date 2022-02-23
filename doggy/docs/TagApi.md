# TagApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppTagGet**](TagApi.md#apiAppTagGet) | **GET** /api/app/tag | 
[**apiAppTagIdDelete**](TagApi.md#apiAppTagIdDelete) | **DELETE** /api/app/tag/{id} | 
[**apiAppTagIdGet**](TagApi.md#apiAppTagIdGet) | **GET** /api/app/tag/{id} | 
[**apiAppTagIdPut**](TagApi.md#apiAppTagIdPut) | **PUT** /api/app/tag/{id} | 
[**apiAppTagPost**](TagApi.md#apiAppTagPost) | **POST** /api/app/tag | 


<a name="apiAppTagGet"></a>
# **apiAppTagGet**
> TagDtoPagedResultDto apiAppTagGet(searchKey, parentTagId, maxResultCount, sorting, skipCount)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TagApi()
val searchKey : kotlin.String = searchKey_example // kotlin.String | 
val parentTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val maxResultCount : kotlin.Int = 56 // kotlin.Int | 
val sorting : kotlin.String = sorting_example // kotlin.String | 
val skipCount : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TagDtoPagedResultDto = apiInstance.apiAppTagGet(searchKey, parentTagId, maxResultCount, sorting, skipCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagApi#apiAppTagGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#apiAppTagGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchKey** | **kotlin.String**|  | [optional]
 **parentTagId** | **java.util.UUID**|  | [optional]
 **maxResultCount** | **kotlin.Int**|  | [optional]
 **sorting** | **kotlin.String**|  | [optional]
 **skipCount** | **kotlin.Int**|  | [optional]

### Return type

[**TagDtoPagedResultDto**](TagDtoPagedResultDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTagIdDelete"></a>
# **apiAppTagIdDelete**
> apiAppTagIdDelete(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TagApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiAppTagIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TagApi#apiAppTagIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#apiAppTagIdDelete")
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

<a name="apiAppTagIdGet"></a>
# **apiAppTagIdGet**
> TagDto apiAppTagIdGet(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TagApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TagDto = apiInstance.apiAppTagIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagApi#apiAppTagIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#apiAppTagIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**TagDto**](TagDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTagIdPut"></a>
# **apiAppTagIdPut**
> TagDto apiAppTagIdPut(id, createUpdateTagDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TagApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createUpdateTagDto : CreateUpdateTagDto =  // CreateUpdateTagDto | 
try {
    val result : TagDto = apiInstance.apiAppTagIdPut(id, createUpdateTagDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagApi#apiAppTagIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#apiAppTagIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createUpdateTagDto** | [**CreateUpdateTagDto**](CreateUpdateTagDto.md)|  | [optional]

### Return type

[**TagDto**](TagDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTagPost"></a>
# **apiAppTagPost**
> TagDto apiAppTagPost(createUpdateTagDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TagApi()
val createUpdateTagDto : CreateUpdateTagDto =  // CreateUpdateTagDto | 
try {
    val result : TagDto = apiInstance.apiAppTagPost(createUpdateTagDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TagApi#apiAppTagPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TagApi#apiAppTagPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUpdateTagDto** | [**CreateUpdateTagDto**](CreateUpdateTagDto.md)|  | [optional]

### Return type

[**TagDto**](TagDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

