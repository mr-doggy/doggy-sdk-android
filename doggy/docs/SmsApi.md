# SmsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppSmsSendChangePhoneCodePost**](SmsApi.md#apiAppSmsSendChangePhoneCodePost) | **POST** /api/app/sms/send-change-phone-code | 
[**apiAppSmsSendLoginCodePost**](SmsApi.md#apiAppSmsSendLoginCodePost) | **POST** /api/app/sms/send-login-code | 


<a name="apiAppSmsSendChangePhoneCodePost"></a>
# **apiAppSmsSendChangePhoneCodePost**
> apiAppSmsSendChangePhoneCodePost(sendSmsCodeDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = SmsApi()
val sendSmsCodeDto : SendSmsCodeDto =  // SendSmsCodeDto | 
try {
    apiInstance.apiAppSmsSendChangePhoneCodePost(sendSmsCodeDto)
} catch (e: ClientException) {
    println("4xx response calling SmsApi#apiAppSmsSendChangePhoneCodePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsApi#apiAppSmsSendChangePhoneCodePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmsCodeDto** | [**SendSmsCodeDto**](SendSmsCodeDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppSmsSendLoginCodePost"></a>
# **apiAppSmsSendLoginCodePost**
> apiAppSmsSendLoginCodePost(sendSmsCodeDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = SmsApi()
val sendSmsCodeDto : SendSmsCodeDto =  // SendSmsCodeDto | 
try {
    apiInstance.apiAppSmsSendLoginCodePost(sendSmsCodeDto)
} catch (e: ClientException) {
    println("4xx response calling SmsApi#apiAppSmsSendLoginCodePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SmsApi#apiAppSmsSendLoginCodePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendSmsCodeDto** | [**SendSmsCodeDto**](SendSmsCodeDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

