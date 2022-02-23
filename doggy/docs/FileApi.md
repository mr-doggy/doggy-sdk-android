# FileApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppFilePreSignUrlPost**](FileApi.md#apiAppFilePreSignUrlPost) | **POST** /api/app/file/pre-sign-url | 
[**apiAppFileUploadCredentialsGet**](FileApi.md#apiAppFileUploadCredentialsGet) | **GET** /api/app/file/upload-credentials | 


<a name="apiAppFilePreSignUrlPost"></a>
# **apiAppFilePreSignUrlPost**
> kotlin.String apiAppFilePreSignUrlPost(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = FileApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.apiAppFilePreSignUrlPost(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileApi#apiAppFilePreSignUrlPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileApi#apiAppFilePreSignUrlPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppFileUploadCredentialsGet"></a>
# **apiAppFileUploadCredentialsGet**
> UploadCredentials apiAppFileUploadCredentialsGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = FileApi()
try {
    val result : UploadCredentials = apiInstance.apiAppFileUploadCredentialsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileApi#apiAppFileUploadCredentialsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileApi#apiAppFileUploadCredentialsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UploadCredentials**](UploadCredentials.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

