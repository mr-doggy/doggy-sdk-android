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
 * @param title 
 * @param content 
 * @param version 
 * @param author 
 * @param authorId 
 * @param creationTime 
 * @param lastModificationTime 
 * @param extension 
 * @param contentFormating 
 * @param name 
 * @param description 
 * @param website 
 */

data class NoteSpecDto (

    @Json(name = "id")
    val id: java.util.UUID? = null,

    @Json(name = "title")
    val title: kotlin.String? = null,

    @Json(name = "content")
    val content: kotlin.String? = null,

    @Json(name = "version")
    val version: kotlin.Int? = null,

    @Json(name = "author")
    val author: kotlin.String? = null,

    @Json(name = "authorId")
    val authorId: java.util.UUID? = null,

    @Json(name = "creationTime")
    val creationTime: java.time.OffsetDateTime? = null,

    @Json(name = "lastModificationTime")
    val lastModificationTime: java.time.OffsetDateTime? = null,

    @Json(name = "extension")
    val extension: kotlin.String? = null,

    @Json(name = "contentFormating")
    val contentFormating: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "website")
    val website: kotlin.String? = null

)
