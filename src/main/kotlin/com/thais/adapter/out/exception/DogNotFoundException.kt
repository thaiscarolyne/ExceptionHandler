package com.thais.adapter.out.exception

import java.lang.Exception

class DogNotFoundException(override val message: String): Exception() {
}