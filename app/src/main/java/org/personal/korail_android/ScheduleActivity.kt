package org.personal.korail_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
        setListener()
    }

    private fun setListener() {
    }
}