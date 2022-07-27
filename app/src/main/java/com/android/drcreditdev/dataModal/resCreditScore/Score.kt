package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Score(

    @SerializedName("version") var version: String? = null,
    @SerializedName("type") var type: String? = null

)