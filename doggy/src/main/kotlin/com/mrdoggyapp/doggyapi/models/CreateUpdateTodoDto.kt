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

import com.squareup.moshi.Json

/**
 * 
 *
 * @param title 
 * @param priority 
 * @param tagIds 
 * @param isDone 
 * @param parentId 
 * @param endAt 
 */

data class CreateUpdateTodoDto (

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "priority")
    val priority: Priority? = null,

    @Json(name = "tagIds")
    val tagIds: kotlin.collections.List<java.util.UUID>? = null,

    @Json(name = "isDone")
    val isDone: kotlin.Boolean? = null,

    @Json(name = "parentId")
    val parentId: java.util.UUID? = null,

    @Json(name = "endAt")
    val endAt: java.time.OffsetDateTime? = null

)

