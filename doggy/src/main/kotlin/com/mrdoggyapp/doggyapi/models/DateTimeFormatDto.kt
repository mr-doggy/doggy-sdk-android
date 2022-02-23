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
 * @param calendarAlgorithmType 
 * @param dateTimeFormatLong 
 * @param shortDatePattern 
 * @param fullDateTimePattern 
 * @param dateSeparator 
 * @param shortTimePattern 
 * @param longTimePattern 
 */

data class DateTimeFormatDto (

    @Json(name = "calendarAlgorithmType")
    val calendarAlgorithmType: kotlin.String? = null,

    @Json(name = "dateTimeFormatLong")
    val dateTimeFormatLong: kotlin.String? = null,

    @Json(name = "shortDatePattern")
    val shortDatePattern: kotlin.String? = null,

    @Json(name = "fullDateTimePattern")
    val fullDateTimePattern: kotlin.String? = null,

    @Json(name = "dateSeparator")
    val dateSeparator: kotlin.String? = null,

    @Json(name = "shortTimePattern")
    val shortTimePattern: kotlin.String? = null,

    @Json(name = "longTimePattern")
    val longTimePattern: kotlin.String? = null

)

