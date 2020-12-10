package com.example.s15_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

const val RESULT_CODE = 2000

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnSecondActivity.setOnClickListener {
            returnName()
            finish()

        }
    }


    private fun returnName() {
        val name = Intent()
        name.putExtra("name", edtSecondActivity.text.toString())
        setResult(RESULT_CODE, name)
    }

    override fun onBackPressed() {
        returnName()
        super.onBackPressed()
    }

}