package com.push;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BooksException.class)
	public ResponseEntity<MyErrorDetails> bookNotFound(BooksException bi,WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),bi.getMessage(),wr.getDescription(false));
		
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(myErrorDetails,HttpStatus.NOT_FOUND);
		
		return re;
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> nullValueError(Exception e,WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
		
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(myErrorDetails,HttpStatus.NOT_FOUND);
		
		return re;
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> bookNotFound(NoHandlerFoundException nhf,WebRequest wr){
		
		MyErrorDetails myErrorDetails=new MyErrorDetails(LocalDateTime.now(),nhf.getMessage(),wr.getDescription(false));
		
		ResponseEntity<MyErrorDetails> re=new ResponseEntity<MyErrorDetails>(myErrorDetails,HttpStatus.BAD_REQUEST);
		
		return re;
	}

}
