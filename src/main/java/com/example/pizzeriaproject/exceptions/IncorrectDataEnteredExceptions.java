package com.example.pizzeriaproject.exceptions;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "data entered incorrectly")
public class IncorrectDataEnteredExceptions extends DataAccessException {
    public IncorrectDataEnteredExceptions(String msg) {
        super(msg);
    }

    public IncorrectDataEnteredExceptions(String msg, Throwable cause) {
        super(msg, cause);
    }
}

