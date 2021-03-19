package com.example.Bank.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.ToString;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity
public class Loan {
	@Id
	private int loanId;//id
	private String type;
	private long amount;
	private float rateofintrest;
	private int duration;
	
	
	public Loan() {
		
	}
	
	public Loan(int loanId, String type, long amount, float rateofintrest, int duration) {
		this.loanId = loanId;
		this.type = type;
		this.amount = amount;
		this.rateofintrest = rateofintrest;
		this.duration = duration;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
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
	public float getRateofintrest() {
		return rateofintrest;
	}
	public void setRateofintrest(float rateofintrest) {
		this.rateofintrest = rateofintrest;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
