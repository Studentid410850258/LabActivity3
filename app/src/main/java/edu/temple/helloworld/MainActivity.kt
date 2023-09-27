package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameET: EditText
    lateinit var clickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameET = findViewById(R.id.nameEditText)
        clickMe = findViewById(R.id.clickMeButton)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            val text = nameET.text.toString()

            if(text.isEmpty()) {
                displayTextView.text = ""
                nameET.setError("No name detected!")
            } else {
                displayTextView.text = "Hello, ${nameET.text}"
            }


        }


    }
}