package com.madpractical1.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            rollDice()
        }

        // 1.2 Homework

        val rollResetButton: Button = findViewById(R.id.btnReset)

        rollResetButton.setOnClickListener{
            rollDefault()
        }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()

     //   Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)

     //   resultText.text = "Dice Rolled!"

        resultText.text = randomInt.toString()
    }

    // 1.2 Homework

    private fun rollDefault(){
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = "0"
    }

}