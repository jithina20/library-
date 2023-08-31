package com.librarymanagement.librarymanagement.Classes;
import jakarta.persistence.*;
import java.util.Set;


@Entity
@Table(name = "book")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sNo;
    private String bookName;
    private String authorName;
    private int bookQty;
    private int bookQtyCopy;
    
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getBookQty() {
		return bookQty;
	}
	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}
	public int getBookQtyCopy() {
		return bookQtyCopy;
	}
	public void setBookQtyCopy(int bookQty) {
		this.bookQtyCopy = bookQty;
	}
	
}
