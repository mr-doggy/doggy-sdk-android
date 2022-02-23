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
 * Values: noteFolder,albumFolder,mediaFolder,musicFolder,documentFolder
 */

enum class SpecialItems(val value: kotlin.String) {

    @Json(name = "NoteFolder")
    noteFolder("NoteFolder"),

    @Json(name = "AlbumFolder")
    albumFolder("AlbumFolder"),

    @Json(name = "MediaFolder")
    mediaFolder("MediaFolder"),

    @Json(name = "MusicFolder")
    musicFolder("MusicFolder"),

    @Json(name = "DocumentFolder")
    documentFolder("DocumentFolder");

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
        fun encode(data: Any?): kotlin.String? = if (data is SpecialItems) "$data" else null

        /**
         * Returns a valid [SpecialItems] for [data], null otherwise.
         */
        fun decode(data: Any?): SpecialItems? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

