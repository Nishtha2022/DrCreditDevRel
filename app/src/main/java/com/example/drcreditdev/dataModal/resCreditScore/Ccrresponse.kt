package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep

data class Ccrresponse (

  @SerializedName("status"           ) var status           : String?                     = null,
  @SerializedName("cirreportDataLst" ) var cirreportDataLst : ArrayList<CirreportDataLst> = arrayListOf()

)