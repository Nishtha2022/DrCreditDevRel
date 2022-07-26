package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class FamilyDetails (

  @SerializedName("seq"                ) var seq                : String? = null,
  @SerializedName("additionalNameType" ) var additionalNameType : String? = null,
  @SerializedName("additionalName"     ) var additionalName     : String? = null

)