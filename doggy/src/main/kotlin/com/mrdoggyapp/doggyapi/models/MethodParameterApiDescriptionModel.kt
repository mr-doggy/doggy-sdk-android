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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param typeAsString 
 * @param type 
 * @param typeSimple 
 * @param isOptional 
 * @param defaultValue 
 */

data class MethodParameterApiDescriptionModel (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "typeAsString")
    val typeAsString: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "typeSimple")
    val typeSimple: kotlin.String? = null,

    @Json(name = "isOptional")
    val isOptional: kotlin.Boolean? = null,

    @Json(name = "defaultValue")
    val defaultValue: kotlin.Any? = null

)
