package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Enquiries(

    @SerializedName("date") var date: String? = null,
    @SerializedName("time") var time: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("institution") var institution: String? = null,
    @SerializedName("requestPurpose") var requestPurpose: String? = null

)