package com.example.cardgame1

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var card_p1 : ImageView
    lateinit var card_p2 : ImageView

    lateinit var player1 : TextView
    lateinit var player2 : TextView

    lateinit var button: Button
    lateinit var random: Random

    var p1 = 0
    var p2 = 0

    var deck = intArrayOf(
        R.drawable.ic_atlas_deck_2_of_spades,
        R.drawable.ic_atlas_deck_10_of_spades,
        R.drawable.ic_atlas_deck_3_of_spades,
        R.drawable.ic_atlas_deck_4_of_spades,
        R.drawable.ic_atlas_deck_5_of_spades,
        R.drawable.ic_atlas_deck_6_of_spades,
        R.drawable.ic_atlas_deck_7_of_spades,
        R.drawable.ic_atlas_deck_8_of_spades,
        R.drawable.ic_atlas_deck_9_of_spades,
        R.drawable.ic_atlas_deck_ace_of_spades,
        R.drawable.ic_atlas_deck_king_of_spades,
        R.drawable.ic_atlas_deck_queen_of_spades,
        R.drawable.ic_atlas_deck_jack_of_spades

    )

    fun setCardImage(number: Int, image:ImageView) {
        image.setImageResource(deck[number])
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random = Random()

        card_p1 = findViewById(R.id.card_p1)
        card_p2 = findViewById(R.id.card_p2)

        card_p1.setImageResource(R.drawable.ic_card_back)
        card_p2.setImageResource(R.drawable.ic_card_back)

        player1 = findViewById(R.id.player1)
        player2 = findViewById(R.id.player2)

        button = findViewById(R.id.button)
        button.setOnClickListener{
            val card1 = random.nextInt(deck.size)
            val card2 = random.nextInt(deck.size)
            setCardImage(card1, card_p1)
            setCardImage(card2, card_p2)





            if (card1 > card2) {
                p1++
                player1.text = "PLayer 1 : $p1"
            } else {
                p2++
                player2.text = "Player 2 : $p2"
            }


        }

    }
}