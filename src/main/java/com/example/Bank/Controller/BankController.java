package com.example.Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bank.Dao.BankRequest;
import com.example.Bank.Dao.Usersgt5L;
import com.example.Bank.Entity.User;
//import com.example.Bank.Repo.LoanRepo;
import com.example.Bank.Repo.UserRepo;



import java.util.*;
import java.util.stream.Collectors;

@RestController
public class BankController {
	
	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/newuser")
	public User register(@RequestBody User user)
	{
		return userRepo.save(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user)
	{
		Optional<User> usertoupdate=userRepo.findById(user.getAccno());
		User u=usertoupdate.get();
		u.setContact(user.getContact());
		//u.setName(user.getName());
		//u.setUsername(user.getUsername());
		//u.setPassword(user.getPassword());
		return userRepo.save(u);
	}

	@PostMapping("/applyloan")
	public User applyLoan(@RequestBody BankRequest request)
	{
		return userRepo.save(request.getUser());
	}
	
	@GetMapping("/allusers")
	public List<User> getAllUsers()
	{
		return userRepo.findAll();
	}
	
	@GetMapping("/allusersgt5L")
	public List<Usersgt5L> getAllUsersgt5L()
	{
		List<Usersgt5L> usersList= userRepo.usersLoanGt5L();//userRepo.usersLoanGt5L();
		
		return usersList.stream().filter(user->(user.getAmount()>500000)).collect(Collectors.toList());
		
		//service layer,bean package,urls,method names, entities
	}
}
