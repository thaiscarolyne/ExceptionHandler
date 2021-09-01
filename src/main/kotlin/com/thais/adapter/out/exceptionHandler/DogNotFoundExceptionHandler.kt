package com.thais.adapter.out.exceptionHandler

import com.thais.adapter.out.exception.DogNotFoundException
import com.thais.adapter.out.response.ErrorResponse
import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import io.micronaut.http.simple.SimpleHttpResponseFactory
import jakarta.inject.Singleton
import java.time.Instant
import java.util.*

@Produces
@Singleton
@Requirements(Requires(classes = [DogNotFoundException::class, ExceptionHandler::class]))
class DogNotFoundExceptionHandler: ExceptionHandler<DogNotFoundException?, HttpResponse<ErrorResponse>> {

    override fun handle(request: HttpRequest<*>?, exception: DogNotFoundException?): HttpResponse<ErrorResponse> {
        val errorResponse = ErrorResponse(
            status = HttpStatus.NOT_FOUND.code,
            message = exception?.message ?: "",
            timeStamp = Date.from(Instant.now()).time
        )
        return SimpleHttpResponseFactory.INSTANCE
            .status(HttpStatus.NOT_FOUND, errorResponse)
    }
}