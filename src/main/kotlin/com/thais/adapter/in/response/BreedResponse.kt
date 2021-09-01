package com.thais.adapter.`in`.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.thais.application.domain.Breed

data class BreedResponse(
    val id: Long = 0,
    val name: String = "",
    @JsonProperty("life_span") val lifeSpan: String = "") {

    constructor(breed: Breed) : this(
        id = breed.id,
        name = breed.name,
        lifeSpan = breed.lifeSpan
    )
}