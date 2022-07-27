package com.android.drcreditdev.dataModal.resCreditScore

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class RecentActivities(

    @SerializedName("accountsDeliquent") var accountsDeliquent: String? = null,
    @SerializedName("accountsOpened") var accountsOpened: String? = null,
    @SerializedName("totalInquiries") var totalInquiries: String? = null,
    @SerializedName("accountsUpdated") var accountsUpdated: String? = null

)