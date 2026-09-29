package com.deepblue.rescue.exception;

/**
 * El recurso buscado no existe (ej. "Animal AN-999 does not exist.").
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
