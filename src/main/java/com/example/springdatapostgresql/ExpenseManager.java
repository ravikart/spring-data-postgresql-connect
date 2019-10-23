package com.example.springdatapostgresql;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ExpenseManager {
	
	public long groupId;
	
	public long transactionID;
	
	public String userName;
	
	public BigDecimal expenseSpend;
	
	public BigDecimal expenseOwn;
	
	public String description;

}
