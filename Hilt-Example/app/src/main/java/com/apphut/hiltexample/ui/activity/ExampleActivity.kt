package com.apphut.hiltexample.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.apphut.hiltexample.R
import com.apphut.hiltexample.ui.viewmodel.ExampleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExampleActivity : AppCompatActivity() {

    val exampleViewModel: ExampleViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        exampleViewModel
    }
}