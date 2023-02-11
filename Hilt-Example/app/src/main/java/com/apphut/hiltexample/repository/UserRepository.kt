package com.apphut.hiltexample.repository

import javax.inject.Inject

class UserRepository @Inject constructor(
    val baseURL: String
) {
}