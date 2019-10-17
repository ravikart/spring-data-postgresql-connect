package com.example.springdatapostgresql;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpenseManager {
	
	@Column
	public long groupId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public long transactionID;
	
	@Column
	public String userName;
	
	@Column
	public BigDecimal expenseSpend;
	
	@Column
	public BigDecimal expenseOwn;
	
	@Column
	public String description;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getExpenseSpend() {
		return expenseSpend;
	}

	public void setExpenseSpend(BigDecimal expenseSpend) {
		this.expenseSpend = expenseSpend;
	}

	public BigDecimal getExpenseOwn() {
		return expenseOwn;
	}

	public void setExpenseOwn(BigDecimal expenseOwn) {
		this.expenseOwn = expenseOwn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
