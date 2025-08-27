package com.hmpay.common

import jakarta.validation.ConstraintViolation
import jakarta.validation.ConstraintViolationException
import jakarta.validation.Validation
import jakarta.validation.Validator

abstract class SelfValidating<T> {

    private val validator: Validator = Validation.buildDefaultValidatorFactory().validator

    /**
     * Evaluates all Bean Validations on the attributes of this instance.
     */
    @Suppress("UNCHECKED_CAST")
    protected fun validateSelf() {
        val violations: Set<ConstraintViolation<T>> = validator.validate(this as T)
        if (violations.isNotEmpty()) {
            throw ConstraintViolationException(violations)
        }
    }
}
