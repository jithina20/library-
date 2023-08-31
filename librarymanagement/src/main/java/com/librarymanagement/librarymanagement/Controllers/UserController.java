package com.librarymanagement.librarymanagement.Controllers;
import java.util.List;
//Importing required classes
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.librarymanagement.librarymanagement.Classes.Book;
import com.librarymanagement.librarymanagement.Classes.User;
import com.librarymanagement.librarymanagement.Services.BookService;
import com.librarymanagement.librarymanagement.Services.UserService;

//Annotation
@RestController
public class UserController {
	@Autowired
	private UserService userService;

   @CrossOrigin
   @GetMapping(value = "/v1/users")
   public List<User> getAllUsers() 
   {		
	return userService.getAllUsers();
   }
   @CrossOrigin
   @RequestMapping(value = "/v1/users/{id}")
	 public Optional<User> getUser(@PathVariable Long sNo) {
	 	return userService.getUser(sNo);
	 }
	 
   @CrossOrigin
	 @PostMapping(value = "/v1/users/add")
	 public void addUser(@RequestBody User user) {
	   userService.addUser(user);
	 }
   @CrossOrigin
	 @PutMapping(value = "/v1/users/{id}")
	 public void updateUser(@RequestBody User user,@PathVariable Long sNo ) {
	   userService.updateUser(sNo,user);
	 }
   @CrossOrigin
	 @DeleteMapping(value = "/v1/users/{id}")
	 public void deleteUser(@PathVariable Long sNo) {
	   userService.deleteUser(sNo);
		 	 
	 }
   
}
