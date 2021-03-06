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

import com.mrdoggyapp.doggyapi.models.ExtensionEnumFieldDto

import com.squareup.moshi.Json

/**
 * 
 *
 * @param fields 
 * @param localizationResource 
 */

data class ExtensionEnumDto (

    @Json(name = "fields")
    val fields: kotlin.collections.List<ExtensionEnumFieldDto>? = null,

    @Json(name = "localizationResource")
    val localizationResource: kotlin.String? = null

)

