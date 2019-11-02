package com.evilcorp.resposnsi126

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var logUser:EditText
    private lateinit var logPw:EditText
    private lateinit var btnLog:Button
    private lateinit var btnReg1:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logUser = findViewById(R.id.logUser)
        logPw = findViewById(R.id.logPw)
        btnLog = findViewById(R.id.btnLog)
        btnReg1 = findViewById(R.id.btnReg1)

        var full_name :String? = ""
        var User :String? = ""
        var Pass :String? = ""

        if (intent.extras != null){
            val bundle = intent.extras
            full_name = bundle?.getString("full_name")
            User = bundle?.getString("User")
            Pass = bundle?.getString("Pass")
            }

        btnLog.setOnClickListener(){
            if (logUser.text.toString() == "hei18" && logPw.text.toString() == "hei18"){
                val intent = Intent(this,HomeActivity::class.java)
                intent.putExtra("full_name",full_name)
                intent.putExtra("User",User)
                intent.putExtra("Pass",Pass)

                Toast.makeText(this,"Log In Successfully",Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }else{
                Toast.makeText(this,"Username or Password Not Valid!!",Toast.LENGTH_SHORT).show()
            }
        }
        btnReg1.setOnClickListener(){
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}

