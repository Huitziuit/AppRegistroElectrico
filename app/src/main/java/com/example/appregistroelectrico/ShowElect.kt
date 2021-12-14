package com.example.appregistroelectrico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class ShowElect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_elect)

        var data = DataElectrodomesticos()
        var electrodomesticos = data.loadData(this)

        var message:String=""
        for (i in (1..electrodomesticos.total)){
            message+="ID: $i \n"
            message+=electrodomesticos.getElect(i-1).getData()
        }

        findViewById<TextView>(R.id.info).text = message


        //------------------------------------Back
        findViewById<MaterialButton>(R.id.btn_back).setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}