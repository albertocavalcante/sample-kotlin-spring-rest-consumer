package com.alberto.consumingrest.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Quote (
    private val type: String,
    private val value: Value)