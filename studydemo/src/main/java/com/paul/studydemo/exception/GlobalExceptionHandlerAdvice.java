package com.paul.studydemo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.paul.studydemo.pojo.ResponseMessage;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseMessage<Object> handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        // Log the exception (optional)
        Logger logger = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
        logger.error("Exception occurred: ", e);
        
        // Return a custom error response
        return new ResponseMessage<>(500, "Backend Error",null);
    }
}
