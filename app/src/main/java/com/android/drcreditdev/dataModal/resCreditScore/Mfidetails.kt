package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Mfidetails(

    @SerializedName("familyDetails") var familyDetails: ArrayList<FamilyDetails> = arrayListOf()

)