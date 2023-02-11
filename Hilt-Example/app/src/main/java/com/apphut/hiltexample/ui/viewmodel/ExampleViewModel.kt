package com.apphut.hiltexample.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.apphut.hiltexample.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(
    private val userRepository: UserRepository
): ViewModel() {

    init {
        printBaseURL()
    }

    private fun printBaseURL() {
        Log.d("BaseURL", userRepository.baseURL)
    }
}