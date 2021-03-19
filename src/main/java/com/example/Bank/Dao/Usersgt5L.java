package com.example.Bank.Dao;

public class Usersgt5L {
	
	private String name;
	private String type;
	private long amount;
	
	
	
	public Usersgt5L(String name, String type, long amount) {
		super();
		this.name = name;
		this.type = type;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
}
