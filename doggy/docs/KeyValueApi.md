# KeyValueApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppKeyValueBoolGet**](KeyValueApi.md#apiAppKeyValueBoolGet) | **GET** /api/app/key-value/bool | 
[**apiAppKeyValueDateTimeGet**](KeyValueApi.md#apiAppKeyValueDateTimeGet) | **GET** /api/app/key-value/date-time | 
[**apiAppKeyValueDecimalGet**](KeyValueApi.md#apiAppKeyValueDecimalGet) | **GET** /api/app/key-value/decimal | 
[**apiAppKeyValueDoubleGet**](KeyValueApi.md#apiAppKeyValueDoubleGet) | **GET** /api/app/key-value/double | 
[**apiAppKeyValueIntGet**](KeyValueApi.md#apiAppKeyValueIntGet) | **GET** /api/app/key-value/int | 
[**apiAppKeyValueSetBoolPost**](KeyValueApi.md#apiAppKeyValueSetBoolPost) | **POST** /api/app/key-value/set-bool | 
[**apiAppKeyValueSetDateTimePost**](KeyValueApi.md#apiAppKeyValueSetDateTimePost) | **POST** /api/app/key-value/set-date-time | 
[**apiAppKeyValueSetDecimalPost**](KeyValueApi.md#apiAppKeyValueSetDecimalPost) | **POST** /api/app/key-value/set-decimal | 
[**apiAppKeyValueSetDoublePost**](KeyValueApi.md#apiAppKeyValueSetDoublePost) | **POST** /api/app/key-value/set-double | 
[**apiAppKeyValueSetIntPost**](KeyValueApi.md#apiAppKeyValueSetIntPost) | **POST** /api/app/key-value/set-int | 
[**apiAppKeyValueSetStringPost**](KeyValueApi.md#apiAppKeyValueSetStringPost) | **POST** /api/app/key-value/set-string | 
[**apiAppKeyValueStringGet**](KeyValueApi.md#apiAppKeyValueStringGet) | **GET** /api/app/key-value/string | 


<a name="apiAppKeyValueBoolGet"></a>
# **apiAppKeyValueBoolGet**
> BooleanKeyValue apiAppKeyValueBoolGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : BooleanKeyValue = apiInstance.apiAppKeyValueBoolGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueBoolGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueBoolGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**BooleanKeyValue**](BooleanKeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueDateTimeGet"></a>
# **apiAppKeyValueDateTimeGet**
> DateTimeKeyValue apiAppKeyValueDateTimeGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DateTimeKeyValue = apiInstance.apiAppKeyValueDateTimeGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueDateTimeGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueDateTimeGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**DateTimeKeyValue**](DateTimeKeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueDecimalGet"></a>
# **apiAppKeyValueDecimalGet**
> DecimalKeyValue apiAppKeyValueDecimalGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DecimalKeyValue = apiInstance.apiAppKeyValueDecimalGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueDecimalGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueDecimalGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**DecimalKeyValue**](DecimalKeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueDoubleGet"></a>
# **apiAppKeyValueDoubleGet**
> DoubleKeyValue apiAppKeyValueDoubleGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : DoubleKeyValue = apiInstance.apiAppKeyValueDoubleGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueDoubleGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueDoubleGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**DoubleKeyValue**](DoubleKeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueIntGet"></a>
# **apiAppKeyValueIntGet**
> Int32KeyValue apiAppKeyValueIntGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : Int32KeyValue = apiInstance.apiAppKeyValueIntGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueIntGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueIntGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**Int32KeyValue**](Int32KeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetBoolPost"></a>
# **apiAppKeyValueSetBoolPost**
> apiAppKeyValueSetBoolPost(key, booleanSetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val booleanSetKeyValueDto : BooleanSetKeyValueDto =  // BooleanSetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetBoolPost(key, booleanSetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetBoolPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetBoolPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **booleanSetKeyValueDto** | [**BooleanSetKeyValueDto**](BooleanSetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetDateTimePost"></a>
# **apiAppKeyValueSetDateTimePost**
> apiAppKeyValueSetDateTimePost(key, dateTimeSetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val dateTimeSetKeyValueDto : DateTimeSetKeyValueDto =  // DateTimeSetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetDateTimePost(key, dateTimeSetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetDateTimePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetDateTimePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **dateTimeSetKeyValueDto** | [**DateTimeSetKeyValueDto**](DateTimeSetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetDecimalPost"></a>
# **apiAppKeyValueSetDecimalPost**
> apiAppKeyValueSetDecimalPost(key, decimalSetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val decimalSetKeyValueDto : DecimalSetKeyValueDto =  // DecimalSetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetDecimalPost(key, decimalSetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetDecimalPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetDecimalPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **decimalSetKeyValueDto** | [**DecimalSetKeyValueDto**](DecimalSetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetDoublePost"></a>
# **apiAppKeyValueSetDoublePost**
> apiAppKeyValueSetDoublePost(key, doubleSetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val doubleSetKeyValueDto : DoubleSetKeyValueDto =  // DoubleSetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetDoublePost(key, doubleSetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetDoublePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetDoublePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **doubleSetKeyValueDto** | [**DoubleSetKeyValueDto**](DoubleSetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetIntPost"></a>
# **apiAppKeyValueSetIntPost**
> apiAppKeyValueSetIntPost(key, int32SetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val int32SetKeyValueDto : Int32SetKeyValueDto =  // Int32SetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetIntPost(key, int32SetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetIntPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetIntPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **int32SetKeyValueDto** | [**Int32SetKeyValueDto**](Int32SetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueSetStringPost"></a>
# **apiAppKeyValueSetStringPost**
> apiAppKeyValueSetStringPost(key, stringSetKeyValueDto)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
val stringSetKeyValueDto : StringSetKeyValueDto =  // StringSetKeyValueDto | 
try {
    apiInstance.apiAppKeyValueSetStringPost(key, stringSetKeyValueDto)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueSetStringPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueSetStringPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]
 **stringSetKeyValueDto** | [**StringSetKeyValueDto**](StringSetKeyValueDto.md)|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiAppKeyValueStringGet"></a>
# **apiAppKeyValueStringGet**
> StringKeyValue apiAppKeyValueStringGet(key)



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = KeyValueApi()
val key : kotlin.String = key_example // kotlin.String | 
try {
    val result : StringKeyValue = apiInstance.apiAppKeyValueStringGet(key)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KeyValueApi#apiAppKeyValueStringGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KeyValueApi#apiAppKeyValueStringGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **kotlin.String**|  | [optional]

### Return type

[**StringKeyValue**](StringKeyValue.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

