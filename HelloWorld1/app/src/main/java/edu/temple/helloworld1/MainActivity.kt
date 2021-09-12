package edu.temple.helloworld1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.view.View
import android.content.Context
import android.util.Log

class MainActivity : AppCompatActivity() {



    //===========================================================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myGreetingTextView = findViewById<TextView>(R.id.my_greeting)

        val button1 = findViewById<Button>(R.id.button1)

        findViewById<Button>(R.id.button1).setOnClickListener { v, ->
            (v as Button).text = "You Clicked the button"
        }


        /*val progress: Int = 20

        button1.setOnClickListener{

            Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_SHORT).show()
            Log.d("Message", "You clicked the button")
            myGreetingTextView.textSize = progress.toFloat()
            myGreetingTextView.alpha = 1- (progress/100f)
        }*/
    }
    //===========================================================================




}