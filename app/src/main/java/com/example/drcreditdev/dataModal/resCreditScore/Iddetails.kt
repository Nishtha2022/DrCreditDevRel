package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Iddetails (

  @SerializedName("seq"     ) var seq     : String? = null,
  @SerializedName("source"  ) var source  : String? = null,
  @SerializedName("idtype"  ) var idtype  : String? = null,
  @SerializedName("idvalue" ) var idvalue : String? = null

)