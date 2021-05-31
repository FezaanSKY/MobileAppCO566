package com.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_screen.*

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val username = intent.getStringExtra(Constants.USER_NAME)
        name.text = username

        val totalQuestions = intent.getIntExtra(Constants.Total_Questions, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        score.text = "Your result is $correctAnswer out of $totalQuestions "

        btn_fin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}