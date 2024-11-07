package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val pic1: ImageView = findViewById(R.id.imageView)
        val txt1: TextView = findViewById(R.id.textView)
        val pic2: ImageView = findViewById(R.id.imageView2)
        val txt2: TextView = findViewById(R.id.textView2)
        val btn: Button = findViewById(R.id.button)
        var isPic2Visible = false

        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                if (isPic2Visible) {
                    pic2.visibility = View.INVISIBLE
                    txt2.visibility = View.INVISIBLE
                    isPic2Visible = false
                } else {
                    pic2.visibility = View.VISIBLE
                    txt2.visibility = View.VISIBLE
                    isPic2Visible = true
                }
            }
        })

        val chkBx: ImageButton = findViewById(R.id.imageButton)
        val chkBx2: ImageButton = findViewById(R.id.imageButton3)
        var isChkBxVis = false

        chkBx.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (isChkBxVis) {
                    chkBx.visibility = View.INVISIBLE
                    isChkBxVis = false
                } else {
                    chkBx2.visibility = View.VISIBLE
                    isChkBxVis = true
                }
            }
        })

        chkBx2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if (isChkBxVis) {
                    chkBx2.visibility = View.INVISIBLE
                    isChkBxVis = false
                } else {
                    chkBx.visibility = View.VISIBLE
                    isChkBxVis = true
                }
            }
        })
    }
}