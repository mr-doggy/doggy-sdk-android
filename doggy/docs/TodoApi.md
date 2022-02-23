# TodoApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppTodoGet**](TodoApi.md#apiAppTodoGet) | **GET** /api/app/todo | 
[**apiAppTodoIdDelete**](TodoApi.md#apiAppTodoIdDelete) | **DELETE** /api/app/todo/{id} | 
[**apiAppTodoIdGet**](TodoApi.md#apiAppTodoIdGet) | **GET** /api/app/todo/{id} | 
[**apiAppTodoIdPut**](TodoApi.md#apiAppTodoIdPut) | **PUT** /api/app/todo/{id} | 
[**apiAppTodoPost**](TodoApi.md#apiAppTodoPost) | **POST** /api/app/todo | 


<a name="apiAppTodoGet"></a>
# **apiAppTodoGet**
> TodoDtoPagedResultDto apiAppTodoGet(searchKey, isDone, tagId, maxResultCount, parentId, isExpired, sorting, skipCount)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TodoApi()
val searchKey : kotlin.String = searchKey_example // kotlin.String | 
val isDone : kotlin.Boolean = true // kotlin.Boolean | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val maxResultCount : kotlin.Int = 56 // kotlin.Int | 
val parentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val isExpired : kotlin.Boolean = true // kotlin.Boolean | 
val sorting : kotlin.String = sorting_example // kotlin.String | 
val skipCount : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : TodoDtoPagedResultDto = apiInstance.apiAppTodoGet(searchKey, isDone, tagId, maxResultCount, parentId, isExpired, sorting, skipCount)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TodoApi#apiAppTodoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TodoApi#apiAppTodoGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchKey** | **kotlin.String**|  | [optional]
 **isDone** | **kotlin.Boolean**|  | [optional]
 **tagId** | **java.util.UUID**|  | [optional]
 **maxResultCount** | **kotlin.Int**|  | [optional]
 **parentId** | **java.util.UUID**|  | [optional]
 **isExpired** | **kotlin.Boolean**|  | [optional]
 **sorting** | **kotlin.String**|  | [optional]
 **skipCount** | **kotlin.Int**|  | [optional]

### Return type

[**TodoDtoPagedResultDto**](TodoDtoPagedResultDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTodoIdDelete"></a>
# **apiAppTodoIdDelete**
> apiAppTodoIdDelete(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TodoApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.apiAppTodoIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling TodoApi#apiAppTodoIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TodoApi#apiAppTodoIdDelete")
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

<a name="apiAppTodoIdGet"></a>
# **apiAppTodoIdGet**
> TodoDto apiAppTodoIdGet(id)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TodoApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TodoDto = apiInstance.apiAppTodoIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TodoApi#apiAppTodoIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TodoApi#apiAppTodoIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |

### Return type

[**TodoDto**](TodoDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTodoIdPut"></a>
# **apiAppTodoIdPut**
> TodoDto apiAppTodoIdPut(id, createUpdateTodoDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TodoApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createUpdateTodoDto : CreateUpdateTodoDto =  // CreateUpdateTodoDto | 
try {
    val result : TodoDto = apiInstance.apiAppTodoIdPut(id, createUpdateTodoDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TodoApi#apiAppTodoIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TodoApi#apiAppTodoIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **createUpdateTodoDto** | [**CreateUpdateTodoDto**](CreateUpdateTodoDto.md)|  | [optional]

### Return type

[**TodoDto**](TodoDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppTodoPost"></a>
# **apiAppTodoPost**
> TodoDto apiAppTodoPost(createUpdateTodoDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = TodoApi()
val createUpdateTodoDto : CreateUpdateTodoDto =  // CreateUpdateTodoDto | 
try {
    val result : TodoDto = apiInstance.apiAppTodoPost(createUpdateTodoDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TodoApi#apiAppTodoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TodoApi#apiAppTodoPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createUpdateTodoDto** | [**CreateUpdateTodoDto**](CreateUpdateTodoDto.md)|  | [optional]

### Return type

[**TodoDto**](TodoDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

