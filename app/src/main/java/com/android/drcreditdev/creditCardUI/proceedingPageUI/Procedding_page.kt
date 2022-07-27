package com.android.drcreditdev.creditCardUI.proceedingPageUI

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.android.drcreditdev.creditCardUI.creditPage.Credit_home_page
import com.android.drcreditdev.creditCardUI.error.Error_page
import com.android.drcreditdev.databinding.ActivityProceddingPageBinding

class Procedding_page : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    lateinit var databinding: ActivityProceddingPageBinding //= ActivityProceddingPageBinding.inflate(layoutInflater)
    lateinit var viewModel: ProceedingPageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProceedingPageViewModel::class.java)

        databinding = ActivityProceddingPageBinding.inflate(layoutInflater)
        setContentView(databinding.root)
        databinding.viewModel = viewModel
        sharedPreferences =
            getSharedPreferences("drFile", MODE_PRIVATE)
        var authToken: String? = sharedPreferences.getString("authToken", "user_token")
        viewModel.authToken = authToken
        databinding.anime.playAnimation()
        getCreditScore()



    }

    private fun getCreditScore() {
        if (intent.getStringExtra("pan") != null
            && intent.getStringExtra("fullName") != null
            && intent.getStringExtra("fatherName") != null
            && intent.getStringExtra("dob") != null
            && intent.getStringExtra("state") != null
            && intent.getStringExtra("address") != null
            && intent.getStringExtra("pinCode") != null
        ) {
            viewModel.pan = intent.getStringExtra("pan").toString()
            viewModel.fullName = intent.getStringExtra("fullName").toString()
            viewModel.fatherName = intent.getStringExtra("fatherName").toString()
            viewModel.dob = intent.getStringExtra("dob").toString()
            viewModel.state = intent.getStringExtra("state").toString()
            viewModel.address = intent.getStringExtra("address").toString()
            viewModel.pinCode = intent.getStringExtra("pinCode").toString()
        } else {
            sharedPreferences = getSharedPreferences("drFile", MODE_PRIVATE)
            viewModel.pan = sharedPreferences.getString("pan", "null")!!
            viewModel.fullName = sharedPreferences.getString("fullName", "null")!!
            viewModel.fatherName = sharedPreferences.getString("fatherName", "null")!!
            viewModel.dob = sharedPreferences.getString("dob", "null")!!
            viewModel.pinCode = sharedPreferences.getString("pinCode", "null")!!
            viewModel.state = sharedPreferences.getString("state", "null")!!
            viewModel.address = sharedPreferences.getString("address", "null")!!
            /*   if(sharedPreferences.getString("diff","null")!=null)
            {
                var diff = sharedPreferences.getString("diff","null")
            }*/


        }
        sharedPreferences =
            getSharedPreferences("drFile", MODE_PRIVATE)
        var authToken: String? = sharedPreferences.getString("authToken", "user_token")


        viewModel.score.observe(this) { score ->
            if ((!score.isNullOrEmpty())) {
                sharedPreferences =
                    getSharedPreferences("drFile", MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putBoolean("isLoggedIn", true)
                editor.putString("pan", viewModel.pan)
                editor.putString("fullName", viewModel.fullName)
                editor.putString("fatherName", viewModel.fatherName)
                editor.putString("dob", viewModel.dob)
                editor.putString("pinCode", viewModel.pinCode)
                editor.putString("state", viewModel.state)
                editor.putString("address", viewModel.address)
                editor.putString("score", viewModel.score.value.toString())

            } else {
                var intent = Intent(applicationContext, Error_page::class.java)
                startActivity(intent)
                finish()
            }
        }

        viewModel.intentInt.observe(this) { value ->
            if (value == 1) {
                var intent =
                    Intent(applicationContext, Credit_home_page::class.java)
                intent.putExtra("score", viewModel.score.value.toString())
                startActivity(intent)
                finish()
            }
            if(value==2) {
                var intent = Intent(applicationContext, Error_page::class.java)
                startActivity(intent)
                finish()
            }
        }
        viewModel.callCreditApi(authToken!!)

    }


}