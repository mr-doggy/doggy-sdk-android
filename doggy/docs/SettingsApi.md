# SettingsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppSettingsGet**](SettingsApi.md#apiAppSettingsGet) | **GET** /api/app/settings | 
[**apiAppSettingsSetPost**](SettingsApi.md#apiAppSettingsSetPost) | **POST** /api/app/settings/set | 


<a name="apiAppSettingsGet"></a>
# **apiAppSettingsGet**
> SettingsDto apiAppSettingsGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = SettingsApi()
try {
    val result : SettingsDto = apiInstance.apiAppSettingsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#apiAppSettingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#apiAppSettingsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsDto**](SettingsDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppSettingsSetPost"></a>
# **apiAppSettingsSetPost**
> apiAppSettingsSetPost(settingsDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = SettingsApi()
val settingsDto : SettingsDto =  // SettingsDto | 
try {
    apiInstance.apiAppSettingsSetPost(settingsDto)
} catch (e: ClientException) {
    println("4xx response calling SettingsApi#apiAppSettingsSetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SettingsApi#apiAppSettingsSetPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsDto** | [**SettingsDto**](SettingsDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

