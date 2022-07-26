package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class CirreportDataLst (

  @SerializedName("inquiryResponseHeader" ) var inquiryResponseHeader : InquiryResponseHeader? = InquiryResponseHeader(),
  @SerializedName("inquiryRequestInfo"    ) var inquiryRequestInfo    : InquiryRequestInfo?    = InquiryRequestInfo(),
  @SerializedName("cirreportData"         ) var cirreportData         : CirreportData?         = CirreportData(),
  @SerializedName("score"                 ) var score                 : ArrayList<Score>       = arrayListOf()

)