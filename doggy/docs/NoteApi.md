# NoteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAppNoteNoteSpecsGet**](NoteApi.md#apiAppNoteNoteSpecsGet) | **GET** /api/app/note/note-specs | 


<a name="apiAppNoteNoteSpecsGet"></a>
# **apiAppNoteNoteSpecsGet**
> NoteSpecDto apiAppNoteNoteSpecsGet()



### Example
```kotlin
// Import classes:
//import com.mrdoggyapp.doggyapi.infrastructure.*
//import com.mrdoggyapp.doggyapi.models.*

val apiInstance = NoteApi()
try {
    val result : NoteSpecDto = apiInstance.apiAppNoteNoteSpecsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoteApi#apiAppNoteNoteSpecsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoteApi#apiAppNoteNoteSpecsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NoteSpecDto**](NoteSpecDto.md)

### Authorization


Configure oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

