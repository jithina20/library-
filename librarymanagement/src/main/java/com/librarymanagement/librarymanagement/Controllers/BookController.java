package com.librarymanagement.librarymanagement.Controllers;
import java.util.List;
//Importing required classes
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.librarymanagement.librarymanagement.Classes.Book;
import com.librarymanagement.librarymanagement.Services.BookService;

//Annotation
@RestController

public class BookController {
	@Autowired
	private BookService bookService;

   @CrossOrigin
   @GetMapping(value = "/v1/books")
   public List<Book> getAllBooks() 
   {		
	return bookService.getAllBooks();
   }
   @CrossOrigin
   @RequestMapping(value = "/v1/books/{id}")
	 public Optional<Book> getBook(@PathVariable Long sNo) {
	 	return bookService.getBook(sNo);
	 }
	 
   @CrossOrigin
	 @PostMapping(value = "/v1/books/add")
	 public void addBook(@RequestBody Book book) {
		 bookService.addBook(book);
	 }
   @CrossOrigin
	 @PutMapping(value = "/v1/books/{id}")
	 public void updateBook(@RequestBody Book book,@PathVariable Long sNo ) {
		 bookService.updateBook(sNo, book);
	 }
   @CrossOrigin
	 @DeleteMapping(value = "/v1/books/{id}")
	 public void deleteBook(@PathVariable Long sNo) {
		 bookService.deleteBook(sNo);
		 	 
	 }
   
}
