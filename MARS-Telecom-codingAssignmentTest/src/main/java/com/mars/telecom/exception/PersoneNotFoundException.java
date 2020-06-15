package com.mars.telecom.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PersoneNotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4084300975604524376L;

	public PersoneNotFoundException(String message){
        super(message);
    }
}
