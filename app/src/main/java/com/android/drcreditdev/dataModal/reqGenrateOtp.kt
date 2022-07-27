package com.android.drcreditdev.dataModal

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class reqGenrateOtp(
    @SerializedName("identifier") val identifier: String?,
    @SerializedName("publicKey") val publicKey: String?,
    @SerializedName("accountIdentifierType") val accountIdentifierType: String?

)
