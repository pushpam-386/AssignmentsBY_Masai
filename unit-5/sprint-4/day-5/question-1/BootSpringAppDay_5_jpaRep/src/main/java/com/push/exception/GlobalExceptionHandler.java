package com.push.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> productError(ProductException pe, WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),pe.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErrorDetails,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionMain(Exception e, WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<>(myErrorDetails,HttpStatus.EXPECTATION_FAILED);
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> error404(NoHandlerFoundException pe, WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),pe.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErrorDetails,HttpStatus.NOT_FOUND);
		
	}

}
