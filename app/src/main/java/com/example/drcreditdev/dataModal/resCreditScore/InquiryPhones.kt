package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class InquiryPhones (

  @SerializedName("seq"       ) var seq       : String?           = null,
  @SerializedName("number"    ) var number    : String?           = null,
  @SerializedName("phoneType" ) var phoneType : ArrayList<String> = arrayListOf()

)