package com.example.helloworld
import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldTextView = findViewById<TextView>(R.id.HelloWorld)
        val button1 = findViewById<Button>(R.id.Button1)



        /*val ocl = object : View.OnClickListener{

            override  fun onClick(v:View?){

                Toast.makeText(this@MainActivity, "You Clicked the button", Toast.LENGTH_LONG).show()
                Log.d("Message", "You Clicked the Button")

            }*/
        button1.setOnClickListener{

            Toast.makeText(this@MainActivity, "You clicked the button", Toast.LENGTH_SHORT).show()
            Log.d("Message", "You Clicked the Button")
        }




        }

    }













}