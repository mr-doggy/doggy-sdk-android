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

import com.mrdoggyapp.doggyapi.models.AppTheme

import com.squareup.moshi.Json

/**
 * 
 *
 * @param android 
 * @param iOS 
 * @param web 
 * @param windows 
 * @param macos 
 * @param linux 
 */

data class AppThemePlatformSettings (

    @Json(name = "android")
    val android: AppTheme? = null,

    @Json(name = "iOS")
    val iOS: AppTheme? = null,

    @Json(name = "web")
    val web: AppTheme? = null,

    @Json(name = "windows")
    val windows: AppTheme? = null,

    @Json(name = "macos")
    val macos: AppTheme? = null,

    @Json(name = "linux")
    val linux: AppTheme? = null

)

