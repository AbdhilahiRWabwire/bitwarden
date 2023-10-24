package com.x8bit.bitwarden.data.vault.datasource.network.model

import com.x8bit.bitwarden.data.platform.datasource.network.serializer.BaseEnumeratedIntSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents different types of cipher repromt.
 */
@Serializable(CipherRepromptTypeSerializer::class)
enum class CipherRepromptTypeJson {
    /**
     * No re-prompt is necessary.
     */
    @SerialName("0")
    NONE,

    /**
     * The user should be prompted for their master password prior to using the cipher password.
     */
    @SerialName("1")
    PASSWORD,
}

private class CipherRepromptTypeSerializer :
    BaseEnumeratedIntSerializer<CipherRepromptTypeJson>(CipherRepromptTypeJson.values())