package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ScoreDetails (

  @SerializedName("version" ) var version : String? = null,
  @SerializedName("type"    ) var type    : String? = null,
  @SerializedName("name"    ) var name    : String? = null,
  @SerializedName("value"   ) var value   : String? = null

)