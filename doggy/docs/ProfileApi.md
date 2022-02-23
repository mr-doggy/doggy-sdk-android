# ProfileApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAccountMyProfileChangePasswordPost**](ProfileApi.md#apiAccountMyProfileChangePasswordPost) | **POST** /api/account/my-profile/change-password | 
[**apiAccountMyProfileGet**](ProfileApi.md#apiAccountMyProfileGet) | **GET** /api/account/my-profile | 
[**apiAccountMyProfilePut**](ProfileApi.md#apiAccountMyProfilePut) | **PUT** /api/account/my-profile | 


<a name="apiAccountMyProfileChangePasswordPost"></a>
# **apiAccountMyProfileChangePasswordPost**
> apiAccountMyProfileChangePasswordPost(changePasswordInput)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ProfileApi()
val changePasswordInput : ChangePasswordInput =  // ChangePasswordInput | 
try {
    apiInstance.apiAccountMyProfileChangePasswordPost(changePasswordInput)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#apiAccountMyProfileChangePasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#apiAccountMyProfileChangePasswordPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePasswordInput** | [**ChangePasswordInput**](ChangePasswordInput.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountMyProfileGet"></a>
# **apiAccountMyProfileGet**
> ProfileDto apiAccountMyProfileGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ProfileApi()
try {
    val result : ProfileDto = apiInstance.apiAccountMyProfileGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#apiAccountMyProfileGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#apiAccountMyProfileGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfileDto**](ProfileDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountMyProfilePut"></a>
# **apiAccountMyProfilePut**
> ProfileDto apiAccountMyProfilePut(updateProfileDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = ProfileApi()
val updateProfileDto : UpdateProfileDto =  // UpdateProfileDto | 
try {
    val result : ProfileDto = apiInstance.apiAccountMyProfilePut(updateProfileDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProfileApi#apiAccountMyProfilePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProfileApi#apiAccountMyProfilePut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateProfileDto** | [**UpdateProfileDto**](UpdateProfileDto.md)|  | [optional]

### Return type

[**ProfileDto**](ProfileDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

