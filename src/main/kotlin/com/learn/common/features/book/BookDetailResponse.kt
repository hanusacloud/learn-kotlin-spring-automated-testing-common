package com.learn.common.features.book

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.learn.common.shared.BaseResponse

class BookDetailResponse @JsonCreator constructor(
        @JsonProperty("status") status: Boolean,
        @JsonProperty("message") message: String,
        @JsonProperty("book") private val book: BookResponse?
) : BaseResponse(status, message) {

    fun getBook(): BookResponse? = book

}