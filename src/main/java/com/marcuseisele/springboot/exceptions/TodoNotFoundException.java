package com.marcuseisele.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by marcuei on 05.07.2016.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class TodoNotFoundException extends RuntimeException {

    public TodoNotFoundException(long id) {
        super(String.format("Todo with ID:%x not found!", id));
    }



}
