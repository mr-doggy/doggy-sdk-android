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
 * Values: folder,picture,video,audio,word,excel,powerPoint,pdf,note,other
 */

enum class ItemType(val value: kotlin.String) {

    @Json(name = "Folder")
    folder("Folder"),

    @Json(name = "Picture")
    picture("Picture"),

    @Json(name = "Video")
    video("Video"),

    @Json(name = "Audio")
    audio("Audio"),

    @Json(name = "Word")
    word("Word"),

    @Json(name = "Excel")
    excel("Excel"),

    @Json(name = "PowerPoint")
    powerPoint("PowerPoint"),

    @Json(name = "Pdf")
    pdf("Pdf"),

    @Json(name = "Note")
    note("Note"),

    @Json(name = "Other")
    other("Other");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): kotlin.String? = if (data is ItemType) "$data" else null

        /**
         * Returns a valid [ItemType] for [data], null otherwise.
         */
        fun decode(data: Any?): ItemType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

