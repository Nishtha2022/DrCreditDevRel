package com.example.example

import androidx.annotation.Keep
import com.example.example.PersonalInfo
import com.google.gson.annotations.SerializedName

@Keep
data class IdandContactInfo (

  @SerializedName("personalInfo" ) var personalInfo : PersonalInfo? = PersonalInfo()

)