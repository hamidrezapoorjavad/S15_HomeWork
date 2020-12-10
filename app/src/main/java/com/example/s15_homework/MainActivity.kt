package com.example.s15_homework

import android.app.Person
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val REQUEST_CODE = 1000

class MainActivity : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CODE) {
            val name = data?.getStringExtra("name")
            tv5.text = name
        }

    }

    val url = "http://google.com"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            for (user in person1) {
                if (edtUser.text.toString() == user.userName && edtPass.text.toString() == user.Password) {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivityForResult(intent, RESULT_CODE)
                } else {
                    Toast.makeText(this, "invalid username or password", Toast.LENGTH_LONG).show()
                }

            }
            tvHelp.setOnClickListener {
                val intent1 = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent1)
            }
        }
    }

}