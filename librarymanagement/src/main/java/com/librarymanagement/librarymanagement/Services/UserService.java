package com.librarymanagement.librarymanagement.Services;
import com.librarymanagement.*;
import com.librarymanagement.librarymanagement.Classes.User;
import com.librarymanagement.librarymanagement.Repositories.UserRepository;

import java.util.ArrayList;  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
@Service
public class UserService {
	@Autowired 
	UserRepository usersRepository;
    public List<User> getAllUsers() {
		
	    List<User> users = new ArrayList<>();
		
	    return (List<User>) usersRepository.findAll();
		
	     		
	}
	public void addUser(User user) {
		usersRepository.save(user);
	}
	public Optional<User> getUser(Long sNo) {
	     return usersRepository.findById(sNo);
	}
	public void updateUser(Long sNo, User user) {
		usersRepository.save(user);
	}
	public void deleteUser(Long sNo) {
		usersRepository.deleteById(sNo);
	}
}

