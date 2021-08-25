package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var teamOneScoreTextView: TextView
    lateinit var teamTwoScoreTextView: TextView
    lateinit var incButton: Button
    lateinit var incButton2: Button
    lateinit var decButton: Button
    lateinit var decButton2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        teamOneScoreTextView = findViewById(R.id.teamOneScoreTextView)
        teamTwoScoreTextView = findViewById(R.id.teamTwoScoreTextView)
        incButton = findViewById(R.id.incButton)
        incButton2 = findViewById(R.id.incButton2)
        decButton = findViewById(R.id.decButton)
        decButton2 = findViewById(R.id.decButton2)
    }

    fun incTeam(v: View) {
        var score1 = teamOneScoreTextView.text.toString().toInt()
        score1++
        teamOneScoreTextView.text = score1.toString()
    }

    fun decTeam(v: View) {
        var score1 = teamOneScoreTextView.text.toString().toInt()
        if (score1 == 0) {
            teamOneScoreTextView.text = "0"
        } else {
            score1--
            teamOneScoreTextView.text = score1.toString()
        }

    }

    fun incTeam2(v: View) {
        var score2 = teamTwoScoreTextView.text.toString().toInt()
        score2++
        teamTwoScoreTextView.text = score2.toString()
    }

    fun decTeam2(v: View) {
        var score2 = teamTwoScoreTextView.text.toString().toInt()
        if (score2 == 0) {
            teamTwoScoreTextView.text = "0"
        } else {
            score2--
            teamTwoScoreTextView.text = score2.toString()
        }

    }

    fun teamScore(v: View) {
        teamOneScoreTextView.text = "0"
    }

    fun teamScore2(v: View) {
        teamTwoScoreTextView.text = "0"
    }

}
