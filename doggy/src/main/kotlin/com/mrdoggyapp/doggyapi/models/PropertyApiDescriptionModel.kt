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
 * @param jsonName 
 * @param type 
 * @param typeSimple 
 * @param isRequired 
 */

data class PropertyApiDescriptionModel (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "jsonName")
    val jsonName: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null,

    @Json(name = "typeSimple")
    val typeSimple: kotlin.String? = null,

    @Json(name = "isRequired")
    val isRequired: kotlin.Boolean? = null

)

