package com.kgmyshin.auth.infra.api.json

import com.google.gson.annotations.SerializedName
import com.kgmyshin.auth.BuildConfig

internal data class PublishTokenRequestJson(
        @SerializedName("code") val code: String,
        @SerializedName("client_id") val clientId: String = BuildConfig.ANNICT_CLIENT_ID,
        @SerializedName("client_secret") val clientSecret: String = BuildConfig.ANNICT_CLIENT_SECRET,
        @SerializedName("grant_type") val grantType: String = "authorization_code",
        @SerializedName("redirect_uri") val redirectUri: String = "urn:ietf:wg:oauth:2.0:oob"
)