package com.alberto.consumingrest.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Value (
    private val id: Int,
    private val quote: String)