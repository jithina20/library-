package com.librarymanagement.librarymanagement.Services;
import com.librarymanagement.*;
import com.librarymanagement.librarymanagement.Classes.Book;
import com.librarymanagement.librarymanagement.Repositories.BookRepository;

import java.util.ArrayList;  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
@Service
public class BookService {
	@Autowired  
	BookRepository booksRepository;
	public List<Book> getAllBooks() {
		
	    List<Book> books = new ArrayList<>();
		
	    return (List<Book>) booksRepository.findAll();
		
	     		
	}
	public void addBook(Book book) {
		booksRepository.save(book);
	}
	public Optional<Book> getBook(Long sNo) {
	     return booksRepository.findById(sNo);
	}
	public void updateBook(Long sNo, Book book) {
		booksRepository.save(book);
	}
	public void deleteBook(Long sNo) {
		booksRepository.deleteById(sNo);
	}
}
