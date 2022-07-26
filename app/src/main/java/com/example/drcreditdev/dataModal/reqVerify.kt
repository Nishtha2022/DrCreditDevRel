package com.example.drcreditdev.dataModal

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
@Keep
data class reqVerify(
    @SerializedName("identifier") val identifier: String?,
    @SerializedName("otp") val otp:Int?,
    @SerializedName("accountIdentifierType") val accountIdentifierType: String?
)
