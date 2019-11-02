package com.evilcorp.resposnsi126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var regName:EditText
    private lateinit var regUser:EditText
    private lateinit var regPw:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        regName = findViewById(R.id.regName)
        regUser = findViewById(R.id.regUser)
        regPw = findViewById(R.id.regPw)

        btnReg2.setOnClickListener() {
            val intent = Intent(this,LoginActivity::class.java)
            intent.putExtra("full_name", regName.text.toString())
            intent.putExtra("User",regUser.text.toString())
            intent.putExtra("Pass",regPw.text.toString())
            Toast.makeText(this,"Register Successfully",Toast.LENGTH_SHORT).show()
            startActivity(intent)


        }


    }
}
