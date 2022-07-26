package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ExampleJson2KtKotlin (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("payload" ) var payload : Payload? = Payload()

)