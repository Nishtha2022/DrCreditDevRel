package com.android.drcreditdev.creditCardUI.error

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.android.drcreditdev.R
import com.android.drcreditdev.creditCardUI.userDetailPageUI.User_details


class Error_page : AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var btnRetry: Button
    lateinit var anime: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error_page)
        btnRetry = findViewById(R.id.btnRetry)
        anime = findViewById(R.id.animeRetry)
        anime.playAnimation()
        btnRetry.setOnClickListener(View.OnClickListener {
            sharedPreferences = getSharedPreferences("drFile", MODE_PRIVATE)
            var intent = Intent(applicationContext, User_details::class.java)
            intent.putExtra("msg", "Please enter the correct details")
            startActivity(intent)
            finish()
        })
    }
}