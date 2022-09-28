package com.push;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookservice")
public class ControllerClass {
	
	@GetMapping(value = "/books")
	public List<Books> getAllBooks(){
		
		List<Books> books=new ArrayList<>();
		
		books.add(new Books(101,"c++","Nitish","Rajput Publication","Computer Programming",1500,240,"G452")); 
		
		return books;
	}

	
	
	@GetMapping(value = "/books/{id}")
	public Books getBooksById(@PathVariable("id") Integer B_id){
		
		
		
		Books books=new Books(B_id,"c++","Nitish","Rajput Publication","Computer Programming",1500,240,"G452"); 
		
		return books;
	}
	
	
	@PostMapping(value = "/newbook")
	public ResponseEntity<Books> createNewBook(@RequestBody Books book){
		
		 HttpHeaders hh=new HttpHeaders();
		 hh.add("Pushpam", "Kumar");
		
		return new ResponseEntity<Books>(book, hh,HttpStatus.BAD_REQUEST);
	}
	
	
	
	@DeleteMapping(value = "/books/{id}")
	public String deleteBookById(@PathVariable("id") Integer B_id){
		
		 
		
		return "Deleted Book"+B_id;
	}
	
	@PutMapping(value = "/book/{id}")
	public String updateBookById(@PathVariable("id") Integer B_id){
		
		 Books books=new Books();
		 books.setBookId(B_id);
		
		return "Book Updated"+B_id;
	}
	
	
	
	@GetMapping(value = "/books/Author")
	public AuthorDTO getAllBooksByAuthor(@RequestBody Books bk){
		
		AuthorDTO authorDTO=new AuthorDTO();
		authorDTO.setAuthor(bk.getAuthor());
		authorDTO.setAuthor_Number(bk.getAuthor_no());
		authorDTO.setCategory(bk.getCategory());
		authorDTO.setId(bk.getBookId());
		authorDTO.setName(bk.getName());
		authorDTO.setPages(bk.getPages());
		authorDTO.setPrice(bk.getPrice());
		authorDTO.setPublication(bk.getPublication());
		authorDTO.setRegistration_Number("G5rt");
		
		return authorDTO;
	}
	


}
