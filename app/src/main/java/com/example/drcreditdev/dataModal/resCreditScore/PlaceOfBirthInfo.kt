package com.example.example

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class PlaceOfBirthInfo (
    @SerializedName("place") var place : String? = "none"

)