package com.push.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

public class GlobalException {
	@ControllerAdvice
	public class GlobalExceptionHandler {

		@ExceptionHandler(AccountException.class)
		public ResponseEntity<MyErrorException> employeeError(AccountException ee,WebRequest wr){
			
			MyErrorException errorDetailClassException=new MyErrorException(LocalDateTime.now(),ee.getMessage(),wr.getDescription(false));
			
			return new ResponseEntity<MyErrorException>(errorDetailClassException,HttpStatus.BAD_REQUEST);
			
		}
		
		@ExceptionHandler(Exception.class)
		public ResponseEntity<MyErrorException> mainException(Exception e,WebRequest wr){
			
			MyErrorException errorDetailClassException=new MyErrorException(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
			
			return new ResponseEntity<MyErrorException>(errorDetailClassException,HttpStatus.EXPECTATION_FAILED);
			
		}
		
		
		@ExceptionHandler(NoHandlerFoundException.class)
		public ResponseEntity<MyErrorException> error404(Exception nhfe,WebRequest wr){
			
			MyErrorException errorDetailClassException=new MyErrorException(LocalDateTime.now(),nhfe.getMessage(),wr.getDescription(false));
			
			return new ResponseEntity<MyErrorException>(errorDetailClassException,HttpStatus.NOT_FOUND);
			
		}
	}

}
