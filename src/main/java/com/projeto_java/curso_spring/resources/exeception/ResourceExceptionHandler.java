package com.projeto_java.curso_spring.resources.exeception;

import com.projeto_java.curso_spring.services.exeception.DataBaseException;
import com.projeto_java.curso_spring.services.exeception.ResourceNotFoundExecption;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExecption.class)
    public ResponseEntity<StandardError> resourceNotFound (ResourceNotFoundExecption e, HttpServletRequest request ) {
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(),error ,e.getMessage(), request.getRequestURI());
        return ResponseEntity.ok().body(err);
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> datBaseError(ResourceNotFoundExecption e, HttpServletRequest request) {
        String error = "Data base error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(),error ,e.getMessage(), request.getRequestURI());
        return ResponseEntity.ok().body(err);
    }

}
