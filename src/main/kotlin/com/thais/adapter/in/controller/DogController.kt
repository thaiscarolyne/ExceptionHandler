package com.thais.adapter.`in`.controller

import com.thais.adapter.`in`.response.BreedResponse
import com.thais.adapter.out.exception.DogNotFoundException
import com.thais.application.`in`.GetBreedPort
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller
class DogController(
    private val getBreedPort: GetBreedPort
) {

    @Get("/breed/{breedId}")
    fun getBreed(@PathVariable breedId: Long): BreedResponse{
        val response = getBreedPort.getBreed(breedId)

        if(response.id == 0L){
            throw DogNotFoundException("There is no breed with the ID $breedId")
        }else{
            return BreedResponse(response)
        }
    }

}