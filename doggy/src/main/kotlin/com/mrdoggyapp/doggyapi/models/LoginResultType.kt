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
 * Values: success,invalidUserNameOrPassword,notAllowed,lockedOut,requiresTwoFactor
 */

enum class LoginResultType(val value: kotlin.String) {

    @Json(name = "Success")
    success("Success"),

    @Json(name = "InvalidUserNameOrPassword")
    invalidUserNameOrPassword("InvalidUserNameOrPassword"),

    @Json(name = "NotAllowed")
    notAllowed("NotAllowed"),

    @Json(name = "LockedOut")
    lockedOut("LockedOut"),

    @Json(name = "RequiresTwoFactor")
    requiresTwoFactor("RequiresTwoFactor");

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
        fun encode(data: Any?): kotlin.String? = if (data is LoginResultType) "$data" else null

        /**
         * Returns a valid [LoginResultType] for [data], null otherwise.
         */
        fun decode(data: Any?): LoginResultType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
