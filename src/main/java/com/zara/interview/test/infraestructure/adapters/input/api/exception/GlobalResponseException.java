package com.zara.interview.test.infraestructure.adapters.input.api.exception;

import com.zara.interview.test.domain.exception.PriceNotFound;
import com.zara.interview.test.infraestructure.adapters.input.api.response.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalResponseException {

    @ExceptionHandler(PriceNotFound.class)
    public ResponseEntity<ErrorMessage> handlePriceNotFoundException(PriceNotFound ex) {
        return new ResponseEntity<>(ErrorMessage.builder()
                .message(ex.getMessage())
                .code(HttpStatus.NOT_FOUND.value()).build(), HttpStatus.NOT_FOUND);
    }

}
