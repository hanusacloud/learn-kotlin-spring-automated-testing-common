package com.learn.common.features.category

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class CategoryResponse @JsonCreator constructor(
        @JsonProperty("id")
        private val id: Long,
        @JsonProperty("name")
        private val name: String
) {

        fun getName(): String = name

}