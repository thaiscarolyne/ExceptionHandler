package com.thais.application.out

import com.thais.application.domain.Breed

interface DogApiPort {

    fun getBreed(id: Long): Breed
}