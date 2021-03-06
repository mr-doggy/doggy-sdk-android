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
 * @param storageClass 
 * @param endPoint 
 * @param protocal 
 * @param bucketName 
 * @param regionId 
 * @param prefix 
 * @param securityToken 
 * @param accessKeyId 
 * @param accessKeySecret 
 * @param expiration 
 * @param expiredTime 
 */

data class UploadCredentials (

    @Json(name = "storageClass")
    val storageClass: kotlin.String? = null,

    @Json(name = "endPoint")
    val endPoint: kotlin.String? = null,

    @Json(name = "protocal")
    val protocal: kotlin.String? = null,

    @Json(name = "bucketName")
    val bucketName: kotlin.String? = null,

    @Json(name = "regionId")
    val regionId: kotlin.String? = null,

    @Json(name = "prefix")
    val prefix: kotlin.String? = null,

    @Json(name = "securityToken")
    val securityToken: kotlin.String? = null,

    @Json(name = "accessKeyId")
    val accessKeyId: kotlin.String? = null,

    @Json(name = "accessKeySecret")
    val accessKeySecret: kotlin.String? = null,

    @Json(name = "expiration")
    val expiration: kotlin.String? = null,

    @Json(name = "expiredTime")
    val expiredTime: kotlin.Long? = null

)

