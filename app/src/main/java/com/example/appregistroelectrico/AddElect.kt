package com.example.appregistroelectrico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class AddElect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_elect)


        findViewById<MaterialButton>(R.id.btn_back).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply{}
            startActivity(intent)
        }
    }
}