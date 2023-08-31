package com.librarymanagement.librarymanagement.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.librarymanagement.*;
import com.librarymanagement.librarymanagement.Classes.Book;
public interface BookRepository extends JpaRepository<Book,Long>{

}
