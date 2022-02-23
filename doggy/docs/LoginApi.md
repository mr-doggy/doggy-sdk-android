# LoginApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAccountCheckPasswordPost**](LoginApi.md#apiAccountCheckPasswordPost) | **POST** /api/account/check-password | 
[**apiAccountLoginPost**](LoginApi.md#apiAccountLoginPost) | **POST** /api/account/login | 
[**apiAccountLogoutGet**](LoginApi.md#apiAccountLogoutGet) | **GET** /api/account/logout | 


<a name="apiAccountCheckPasswordPost"></a>
# **apiAccountCheckPasswordPost**
> AbpLoginResult apiAccountCheckPasswordPost(userLoginInfo)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = LoginApi()
val userLoginInfo : UserLoginInfo =  // UserLoginInfo | 
try {
    val result : AbpLoginResult = apiInstance.apiAccountCheckPasswordPost(userLoginInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#apiAccountCheckPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#apiAccountCheckPasswordPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLoginInfo** | [**UserLoginInfo**](UserLoginInfo.md)|  | [optional]

### Return type

[**AbpLoginResult**](AbpLoginResult.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountLoginPost"></a>
# **apiAccountLoginPost**
> AbpLoginResult apiAccountLoginPost(userLoginInfo)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = LoginApi()
val userLoginInfo : UserLoginInfo =  // UserLoginInfo | 
try {
    val result : AbpLoginResult = apiInstance.apiAccountLoginPost(userLoginInfo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#apiAccountLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#apiAccountLoginPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userLoginInfo** | [**UserLoginInfo**](UserLoginInfo.md)|  | [optional]

### Return type

[**AbpLoginResult**](AbpLoginResult.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAccountLogoutGet"></a>
# **apiAccountLogoutGet**
> apiAccountLogoutGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = LoginApi()
try {
    apiInstance.apiAccountLogoutGet()
} catch (e: ClientException) {
    println("4xx response calling LoginApi#apiAccountLogoutGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#apiAccountLogoutGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

