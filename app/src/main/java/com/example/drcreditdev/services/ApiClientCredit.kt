package com.example.drcreditdev.services
import androidx.viewbinding.BuildConfig
import com.example.drcreditdev.repository.RetrofitApi
import com.triggertrap.seekarc.BuildConfig.FLAVOR
import com.xwray.groupie.databinding.BuildConfig.FLAVOR
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import com.airbnb.lottie.BuildConfig as BuildConfig1


class ApiClientCredit {

    //  val base_url = "https://stage.terrafin.tech:8090/underwriting/creditScore/"
 /*   private val base_url = {
        if(BuildConfig.FLAVOR==)
    }*/
    private lateinit var apiService: RetrofitApi

    fun getApiService(): RetrofitApi {


        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY


        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(15, TimeUnit.SECONDS)
            .addInterceptor(logging)
            .build()

        if (!::apiService.isInitialized) {
            val retrofit = Retrofit.Builder()
                .baseUrl(if(com.example.drcreditdev.BuildConfig.FLAVOR=="prod"){
                    "https://api.acecredit.in/"
                }
                else
                {
                    "https://stage.terrafin.tech:8090/"
                })
                .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient)
                .build()

            apiService = retrofit.create(RetrofitApi::class.java)
        }

        return apiService
    }


}