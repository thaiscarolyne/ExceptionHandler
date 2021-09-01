package com.thais.application.services

import com.thais.application.`in`.GetBreedPort
import com.thais.application.domain.Breed
import com.thais.application.out.DogApiPort
import jakarta.inject.Singleton

@Singleton
class DogService(
    private val dogApiPort: DogApiPort
): GetBreedPort {
    override fun getBreed(id: Long): Breed {
        return dogApiPort.getBreed(id)
    }
}