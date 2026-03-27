package com.hibernate.crud.exception;

public class DuplicateOwnerFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuplicateOwnerFoundException(String message) {
        super(message);
    }
}