package com.android.drcreditdev.repository

import com.android.drcreditdev.dataModal.*
import com.android.drcreditdev.dataModal.resCreditScore.ExampleJson2KtKotlin
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.POST

interface RetrofitApi {
    @POST("user/requestOTP")
    suspend fun createPost(@Body dataModal: reqGenrateOtp?): Response<ResponseBody>

    @POST("user/verifyOTP")
    suspend fun login(@Body dataModal: reqVerify?): Response<resVerify?>?


    @POST("underwriting/creditScore/UnverifiedUser")
    suspend fun fetchCreditScore(
        @HeaderMap headers: HashMap<String, String>,
        @Body dataModal: reqCreditScore?
    ): Response<ExampleJson2KtKotlin?>?

    @GET("underwriting/refreshCreditScore")
    suspend fun getRefreshScore(@HeaderMap headers: HashMap<String, String>): Response<ExampleJson2KtKotlin?>?

    @GET("user/")
    suspend fun fetchUser(@HeaderMap headers: HashMap<String, String>): Response<dataUser>

}