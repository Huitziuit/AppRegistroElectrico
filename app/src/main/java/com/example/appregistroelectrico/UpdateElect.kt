package com.example.appregistroelectrico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class UpdateElect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_elect)

        findViewById<MaterialButton>(R.id.btn_back).setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}