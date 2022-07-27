package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class IdandContactInfo(

    @SerializedName("personalInfo") var personalInfo: PersonalInfo? = PersonalInfo()

)