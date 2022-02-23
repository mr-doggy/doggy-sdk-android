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

import com.mrdoggyapp.doggyapi.models.TenantDto

import com.squareup.moshi.Json

/**
 * 
 *
 * @param items 
 * @param totalCount 
 */

data class TenantDtoPagedResultDto (

    @Json(name = "items")
    val items: kotlin.collections.List<TenantDto>? = null,

    @Json(name = "totalCount")
    val totalCount: kotlin.Long? = null

)

