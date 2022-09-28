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

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<ErrorDetailClassException> employeeError(EmployeeException ee,WebRequest wr){
		
		ErrorDetailClassException errorDetailClassException=new ErrorDetailClassException(LocalDateTime.now(),ee.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetailClassException>(errorDetailClassException,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetailClassException> mainException(Exception e,WebRequest wr){
		
		ErrorDetailClassException errorDetailClassException=new ErrorDetailClassException(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetailClassException>(errorDetailClassException,HttpStatus.EXPECTATION_FAILED);
		
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetailClassException> error404(Exception nhfe,WebRequest wr){
		
		ErrorDetailClassException errorDetailClassException=new ErrorDetailClassException(LocalDateTime.now(),nhfe.getMessage(),wr.getDescription(false));
		
		return new ResponseEntity<ErrorDetailClassException>(errorDetailClassException,HttpStatus.NOT_FOUND);
		
	}
}

