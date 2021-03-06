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

import com.mrdoggyapp.doggyapi.models.Priority
import com.mrdoggyapp.doggyapi.models.TagDto

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
 * @param title 
 * @param priority 
 * @param tags 
 * @param doneAt 
 * @param isDone 
 * @param children 
 */

data class TodoDto (

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

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "priority")
    val priority: Priority? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<TagDto>? = null,

    @Json(name = "doneAt")
    val doneAt: java.time.OffsetDateTime? = null,

    @Json(name = "isDone")
    val isDone: kotlin.Boolean? = null,

    @Json(name = "children")
    val children: kotlin.collections.List<TodoDto>? = null

)

