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

import com.mrdoggyapp.doggyapi.models.ExtensionPropertyDto

import com.squareup.moshi.Json

/**
 * 
 *
 * @param properties 
 * @param configuration 
 */

data class EntityExtensionDto (

    @Json(name = "properties")
    val properties: kotlin.collections.Map<kotlin.String, ExtensionPropertyDto>? = null,

    @Json(name = "configuration")
    val configuration: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

)

