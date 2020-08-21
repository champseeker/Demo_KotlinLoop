package sg.edu.rp.c347.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            for (i in 1..5) {
                Log.d("MainActivity", "onCreate: $i")
            }

        }

        button2.setOnClickListener {

            val word = editTextTextPersonName.text.toString()

            for(letter in word){
                Log.d("MainActivity", "onCreate: $letter")
            }

        }

    }
}