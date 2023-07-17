package com.example.kotlintouchapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //id（View）を取得
        val tx : TextView = findViewById(R.id.tv)
        val blueBtn : Button = findViewById((R.id.blue_btn))
        val redBtn : Button = findViewById((R.id.red_btn))
        val clearBtn : Button = findViewById((R.id.clear_btn))
        // クリック処理
        blueBtn.setOnClickListener{
            // 押した時の処理を書く
            tx.text = blueBtn.text
            tx.setTextColor(Color.BLUE)
        }
        redBtn.setOnClickListener{
            // 押した時の処理を書く
            tx.text = redBtn.text
            tx.setTextColor(Color.RED)
        }
        clearBtn.setOnClickListener{
            // 押した時の処理を書く
            tx.text = "Hello"
            tx.setTextColor(Color.BLACK)
        }
    }
}