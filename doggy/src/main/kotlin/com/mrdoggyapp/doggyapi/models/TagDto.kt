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
 * @param id 
 * @param creationTime 
 * @param creatorId 
 * @param lastModificationTime 
 * @param lastModifierId 
 * @param isDeleted 
 * @param deleterId 
 * @param deletionTime 
 * @param name 
 * @param tagCount 
 * @param parentTagId 
 * @param parentTag 
 * @param children 
 * @param fullPath 
 */

data class TagDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "creationTime")
    val creationTime: java.time.OffsetDateTime? = null,

    @Json(name = "creatorId")
    val creatorId: java.util.UUID? = null,

    @Json(name = "lastModificationTime")
    val lastModificationTime: java.time.OffsetDateTime? = null,

    @Json(name = "lastModifierId")
    val lastModifierId: java.util.UUID? = null,

    @Json(name = "isDeleted")
    val isDeleted: kotlin.Boolean? = null,

    @Json(name = "deleterId")
    val deleterId: java.util.UUID? = null,

    @Json(name = "deletionTime")
    val deletionTime: java.time.OffsetDateTime? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "tagCount")
    val tagCount: kotlin.Int? = null,

    @Json(name = "parentTagId")
    val parentTagId: kotlin.String? = null,

    @Json(name = "parentTag")
    val parentTag: TagDto? = null,

    @Json(name = "children")
    val children: kotlin.collections.List<TagDto>? = null,

    @Json(name = "fullPath")
    val fullPath: kotlin.String? = null

)

