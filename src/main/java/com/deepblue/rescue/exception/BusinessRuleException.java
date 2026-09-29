package com.deepblue.rescue.exception;

/**
 * El recurso existe, pero la operación solicitada viola una regla de negocio
 * (ej. registrar un tratamiento para un animal ya liberado).
 */
public class BusinessRuleException extends RuntimeException {

    public BusinessRuleException(String message) {
        super(message);
    }
}
