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
 * @param extraProperties 
 * @param id 
 * @param name 
 * @param isDefault 
 * @param isStatic 
 * @param isPublic 
 * @param concurrencyStamp 
 */

data class IdentityRoleDto (

    @Json(name = "extraProperties")
    val extraProperties: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "isDefault")
    val isDefault: kotlin.Boolean? = null,

    @Json(name = "isStatic")
    val isStatic: kotlin.Boolean? = null,

    @Json(name = "isPublic")
    val isPublic: kotlin.Boolean? = null,

    @Json(name = "concurrencyStamp")
    val concurrencyStamp: kotlin.String? = null

)
