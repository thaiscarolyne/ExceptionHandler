package com.thais.adapter.out.dogApi

import com.thais.application.domain.Breed
import com.thais.application.out.DogApiPort
import jakarta.inject.Singleton

@Singleton
class DogApiPortImpl(
    private val dogApiClient: DogApiClient
): DogApiPort {

    override fun getBreed(id: Long): Breed {
       val breedResponse = dogApiClient.getBreed(id)
       return Breed(breedResponse.id, breedResponse.name, breedResponse.lifeSpan)
    }
}