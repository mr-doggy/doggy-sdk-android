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

import com.mrdoggyapp.doggyapi.models.DateTimeFormatDto

import com.squareup.moshi.Json

/**
 * 
 *
 * @param displayName 
 * @param englishName 
 * @param threeLetterIsoLanguageName 
 * @param twoLetterIsoLanguageName 
 * @param isRightToLeft 
 * @param cultureName 
 * @param name 
 * @param nativeName 
 * @param dateTimeFormat 
 */

data class CurrentCultureDto (

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "englishName")
    val englishName: kotlin.String? = null,

    @Json(name = "threeLetterIsoLanguageName")
    val threeLetterIsoLanguageName: kotlin.String? = null,

    @Json(name = "twoLetterIsoLanguageName")
    val twoLetterIsoLanguageName: kotlin.String? = null,

    @Json(name = "isRightToLeft")
    val isRightToLeft: kotlin.Boolean? = null,

    @Json(name = "cultureName")
    val cultureName: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "nativeName")
    val nativeName: kotlin.String? = null,

    @Json(name = "dateTimeFormat")
    val dateTimeFormat: DateTimeFormatDto? = null

)
