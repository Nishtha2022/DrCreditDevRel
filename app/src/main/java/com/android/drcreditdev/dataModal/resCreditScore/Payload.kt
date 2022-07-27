package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Payload(
    @SerializedName("inquiryResponseHeader") var inquiryResponseHeader: InquiryResponseHeader? = InquiryResponseHeader(),
    @SerializedName("inquiryRequestInfo") var inquiryRequestInfo: InquiryRequestInfo? = InquiryRequestInfo(),
    @SerializedName("score") var score: ArrayList<Score> = arrayListOf(),
    @SerializedName("error") var error: String? = null,
    @SerializedName("ccrresponse") var ccrresponse: Ccrresponse? = Ccrresponse()

)