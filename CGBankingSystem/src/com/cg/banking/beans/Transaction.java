package com.cg.banking.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionId;
	private float amount;
	@ManyToOne
	private String transactionType;
	public Transaction() {}
	public Transaction(float amount,String transactionType)
	{
		super();
		this.amount=amount;
		this.transactionType=transactionType;
	}
	public Transaction(int transactionId,float amount,String transactionType){
		super();
		this.transactionId=transactionId;
		this.transactionType=transactionType;
		this.amount=amount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTransacriotnType() {
		return transactionType;
	}
	public void setTransacriotnType(String transacriotnType) {
		this.transactionType = transacriotnType;
	}
}
