package com.db.SpringBoot.SpringBootPractice.Exception;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.NoSuchElementException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){

        ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionResponse , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({NoSuchElementException.class})
    public final ResponseEntity<Object> handleNoElementExceptions(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse= new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(true));
        return new ResponseEntity(exceptionResponse , HttpStatus.NOT_FOUND);


    }




    }
