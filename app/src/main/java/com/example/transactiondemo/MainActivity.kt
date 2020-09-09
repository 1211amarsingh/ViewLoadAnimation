package com.example.transactiondemo

import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.include_layout_user_rounds.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val trans_l2r = AnimationUtils.loadAnimation(this, R.anim.translate_left_to_right)
        val trans_r2l = AnimationUtils.loadAnimation(this, R.anim.translate_right_to_left)

        val trans_b2t = AnimationUtils.loadAnimation(this, R.anim.translate_down_to_up)

        rlHeader.startAnimation(trans_l2r)
        llquestion.startAnimation(trans_r2l)
        iv_question.startAnimation(trans_b2t)
    }
}