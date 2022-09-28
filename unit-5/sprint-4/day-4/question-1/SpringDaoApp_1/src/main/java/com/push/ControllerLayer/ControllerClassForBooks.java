package com.push.ControllerLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.push.persistenceLayer.Books;

@RestController
@RequestMapping(value = "/bookstore")
public class ControllerClassForBooks {
	
	@Autowired
	private Books book;
	
	@GetMapping("/books")
	public ResponseEntity<Books> getAllBookDetails() {
		book.setAuthor("Pushpam");
		book.setBook_Id(7);
		book.setName("DeadPool");
		book.setPrice(500);
		
		HttpHeaders hh=new HttpHeaders();
		hh.add("Pushpam", "name");
		
		return new ResponseEntity<Books>(book, hh, HttpStatus.BAD_REQUEST);
	}
}
