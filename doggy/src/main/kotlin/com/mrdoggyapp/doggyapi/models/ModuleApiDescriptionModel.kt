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

package com.mrdoggyapp.doggyapi.models

import com.mrdoggyapp.doggyapi.models.ControllerApiDescriptionModel

import com.squareup.moshi.Json

/**
 * 
 *
 * @param rootPath 
 * @param remoteServiceName 
 * @param controllers 
 */

data class ModuleApiDescriptionModel (

    @Json(name = "rootPath")
    val rootPath: kotlin.String? = null,

    @Json(name = "remoteServiceName")
    val remoteServiceName: kotlin.String? = null,

    @Json(name = "controllers")
    val controllers: kotlin.collections.Map<kotlin.String, ControllerApiDescriptionModel>? = null

)

