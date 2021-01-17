package com.roadmate.app.api.response

import com.agronutritions.shop.api.response.AppVersionTrans
import com.google.gson.annotations.SerializedName

data class AppVersionMaster(
    @SerializedName("error") val error: String,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: ArrayList<AppVersionTrans>
)