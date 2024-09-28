package com.talli.common

data class LoginResponse(
    val accessToken: String,
    val refreshToken: String,
)
