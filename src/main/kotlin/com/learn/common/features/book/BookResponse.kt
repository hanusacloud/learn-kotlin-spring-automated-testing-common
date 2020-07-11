package com.learn.common.features.book

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.learn.common.features.category.CategoryResponse
import java.util.*

class BookResponse @JsonCreator constructor(
        @JsonProperty("id") private val id: Long,
        @JsonProperty("title") private val title: String,
        @JsonProperty("total_page") private val totalPage: Int,
        @JsonProperty("created_at") private val createdAt: Date?,
        @JsonProperty("price") private val price: Long,
        @JsonProperty("category") private val category: CategoryResponse
) {

    fun getTitle(): String = title

    fun getId(): Long = id

    fun getTotalPage(): Int = totalPage

    fun getCreatedAt(): Date? = createdAt

    fun getPrice(): Long = price

    fun getCategory(): CategoryResponse = category

}