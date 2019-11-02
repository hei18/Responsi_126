package com.evilcorp.resposnsi126

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class AccountActivity : AppCompatActivity() {

    private lateinit var fullNameA:TextView
    private lateinit var UserAkunA:TextView
    private lateinit var PassAkunA:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        fullNameA = findViewById(R.id.fullName)
        UserAkunA = findViewById(R.id.UserAkun)
        PassAkunA = findViewById(R.id.PassAkun)
        var full_name :String? = ""
        var User :String? = ""
        var Pass :String? = ""

        if (intent.extras != null){
            val bundle = intent.extras
            full_name = bundle?.getString("full_name")
            User = bundle?.getString("User")
            Pass = bundle?.getString("Pass")

            fullNameA.setText("Full Name : "+full_name)
            UserAkunA.setText("Username  : "+User)
            PassAkunA.setText("Passwor   : "+Pass)
        }
    }
}
