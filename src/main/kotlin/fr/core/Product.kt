package fr.core

import com.fasterxml.jackson.annotation.JsonProperty

data class Product(
    @JsonProperty("name")
    val name: String,
)