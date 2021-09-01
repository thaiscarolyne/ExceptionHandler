package com.thais.application.`in`

import com.thais.application.domain.Breed

interface GetBreedPort {

    fun getBreed(id: Long): Breed
}