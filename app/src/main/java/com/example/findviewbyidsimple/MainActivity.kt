package com.example.findviewbyidsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var worldText = findViewById<TextView>(R.id.worldTextId);
      //  Toast.makeText(this, worldText.text, Toast.LENGTH_LONG).show()

        worldText.setOnClickListener{
            Toast.makeText(this, worldText.text, Toast.LENGTH_LONG).show()
        }

        // Now do the same for the other two View items in the layout (xml file)

    }
}