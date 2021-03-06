/**
 * Doggy API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.mrdoggyapp.doggyapi.apis

import com.mrdoggyapp.doggyapi.models.NoteSpecDto
import com.mrdoggyapp.doggyapi.models.RemoteServiceErrorResponse

import com.mrdoggyapp.doggyapi.infrastructure.ApiClient
import com.mrdoggyapp.doggyapi.infrastructure.ClientException
import com.mrdoggyapp.doggyapi.infrastructure.ClientError
import com.mrdoggyapp.doggyapi.infrastructure.ServerException
import com.mrdoggyapp.doggyapi.infrastructure.ServerError
import com.mrdoggyapp.doggyapi.infrastructure.MultiValueMap
import com.mrdoggyapp.doggyapi.infrastructure.RequestConfig
import com.mrdoggyapp.doggyapi.infrastructure.RequestMethod
import com.mrdoggyapp.doggyapi.infrastructure.ResponseType
import com.mrdoggyapp.doggyapi.infrastructure.Success
import com.mrdoggyapp.doggyapi.infrastructure.toMultiValue

class NoteApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("com.mrdoggyapp.doggyapi.baseUrl", "http://localhost")
        }
    }

    /**
    * 
    * 
    * @return NoteSpecDto
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apiAppNoteNoteSpecsGet() : NoteSpecDto {
        val localVariableConfig = apiAppNoteNoteSpecsGetRequestConfig()

        val localVarResponse = request<Unit, NoteSpecDto>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NoteSpecDto
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation apiAppNoteNoteSpecsGet
    *
    * @return RequestConfig
    */
    fun apiAppNoteNoteSpecsGetRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/app/note/note-specs",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
