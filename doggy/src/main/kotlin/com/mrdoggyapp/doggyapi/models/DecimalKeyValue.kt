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
 * @param `value` 
 * @param durationSeconds 
 * @param expiredAt 
 * @param createdAt 
 */

data class DecimalKeyValue (

    @Json(name = "value")
    val `value`: kotlin.Double? = null,

    @Json(name = "durationSeconds")
    val durationSeconds: kotlin.Double? = null,

    @Json(name = "expiredAt")
    val expiredAt: java.time.OffsetDateTime? = null,

    @Json(name = "createdAt")
    val createdAt: java.time.OffsetDateTime? = null

)
