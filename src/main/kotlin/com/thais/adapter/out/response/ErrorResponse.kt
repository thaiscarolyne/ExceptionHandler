package com.thais.adapter.out.response

data class ErrorResponse(
    var status: Int,
    var message: String,
    var timeStamp: Long
)