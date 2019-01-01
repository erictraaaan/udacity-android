package com.example.erict.diceroller

//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var rollButton: Button
    lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton= findViewById(R.id.roll_button)
        resultText = findViewById(R.id.result_text)
        diceImage = findViewById(R.id.dice_image)

        rollButton.text = getString(R.string.lets_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultText.text = randomInt.toString()
        diceImage.setImageResource(drawableResource)

    }
}
