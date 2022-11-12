package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class QuizQuestionsActivity : AppCompatActivity() {

    private var tv_Question : TextView? = null
    private var iv_flag : ImageView? = null
    private var progressBar : ProgressBar? = null
    private var tv_progress : TextView? = null
    private var tv_optionOne: TextView? = null
    private var tv_optionTwo: TextView? = null
    private var tv_optionThree: TextView? = null
    private var tv_optionFour: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        iv_flag = findViewById(R.id.iv_flag)
        tv_Question = findViewById(R.id.tv_Question)
        tv_progress = findViewById(R.id.tv_progress)
        tv_optionOne = findViewById(R.id.tv_optionOne)
        tv_optionTwo = findViewById(R.id.tv_optionTwo)
        tv_optionThree = findViewById(R.id.tv_optionThree)
        tv_optionFour = findViewById(R.id.tv_optionFour)

        val questionList = Constants.getQuestions()

        var currentPosition = 1
        val question : Question = questionList[currentPosition-1]
        tv_Question?.text = question.question
        iv_flag?.setImageResource(question.image)
        progressBar?.progress = currentPosition
        tv_progress?.text = "$currentPosition/${progressBar?.max}"
        tv_optionOne?.text = question.optionOne
        tv_optionTwo?.text = question.optionTwo
        tv_optionThree?.text = question.optionThree
        tv_optionFour?.text = question.optionFour

    }
}