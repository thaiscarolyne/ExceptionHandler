package com.thais.adapter.out.dogApi

import com.thais.adapter.`in`.response.BreedResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Headers
import io.micronaut.http.client.annotation.Client

@Client("https://api.thedogapi.com/")
@Headers(
    Header(name = "Content-Type", value = "application/json"),
    Header(name = "x-api-key", value = "\${dogapi.key}")
)
interface DogApiClient {

    @Get("v1/breeds/{breedId}")
    fun getBreed(breedId: Long): BreedResponse
}