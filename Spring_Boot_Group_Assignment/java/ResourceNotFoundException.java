// src/main/java/com/example/productcrud/exception/ResourceNotFoundException.java
package com.example.productcrud.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
