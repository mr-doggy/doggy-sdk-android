# AccountApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAccountRegisterPost**](AccountApi.md#apiAccountRegisterPost) | **POST** /api/account/register | 
[**apiAccountResetPasswordPost**](AccountApi.md#apiAccountResetPasswordPost) | **POST** /api/account/reset-password | 
[**apiAccountSendPasswordResetCodePost**](AccountApi.md#apiAccountSendPasswordResetCodePost) | **POST** /api/account/send-password-reset-code | 


<a name="apiAccountRegisterPost"></a>
# **apiAccountRegisterPost**
> IdentityUserDto apiAccountRegisterPost(registerDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = AccountApi()
val registerDto : RegisterDto =  // RegisterDto | 
try {
    val result : IdentityUserDto = apiInstance.apiAccountRegisterPost(registerDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#apiAccountRegisterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#apiAccountRegisterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerDto** | [**RegisterDto**](RegisterDto.md)|  | [optional]

### Return type

[**IdentityUserDto**](IdentityUserDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountResetPasswordPost"></a>
# **apiAccountResetPasswordPost**
> apiAccountResetPasswordPost(resetPasswordDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = AccountApi()
val resetPasswordDto : ResetPasswordDto =  // ResetPasswordDto | 
try {
    apiInstance.apiAccountResetPasswordPost(resetPasswordDto)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#apiAccountResetPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#apiAccountResetPasswordPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resetPasswordDto** | [**ResetPasswordDto**](ResetPasswordDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountSendPasswordResetCodePost"></a>
# **apiAccountSendPasswordResetCodePost**
> apiAccountSendPasswordResetCodePost(sendPasswordResetCodeDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = AccountApi()
val sendPasswordResetCodeDto : SendPasswordResetCodeDto =  // SendPasswordResetCodeDto | 
try {
    apiInstance.apiAccountSendPasswordResetCodePost(sendPasswordResetCodeDto)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#apiAccountSendPasswordResetCodePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#apiAccountSendPasswordResetCodePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendPasswordResetCodeDto** | [**SendPasswordResetCodeDto**](SendPasswordResetCodeDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

