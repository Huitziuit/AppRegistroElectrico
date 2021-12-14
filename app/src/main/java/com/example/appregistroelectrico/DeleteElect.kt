package com.example.appregistroelectrico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class DeleteElect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_elect)

        findViewById<MaterialButton>(R.id.btn_back).setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        findViewById<MaterialButton>(R.id.btn_delete).setOnClickListener {
            var index = findViewById<TextInputEditText>(R.id.ID_delete).text.toString().toInt()
            var myData=DataElectrodomesticos()
            Log.i("indexxx","$index")
            myData.deleteForIndex(this, index)
        }
    }
}