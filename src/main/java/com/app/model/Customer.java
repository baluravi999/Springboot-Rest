package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id	
private int custId;
private String custName;
private String custEmail;
/**
 * 
 */
private String custLoc;
public String getCustEmail() {
	return custEmail;
}
public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}
public String getCustLoc() {
	return custLoc;
}
public void setCustLoc(String custLoc) {
	this.custLoc = custLoc;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custLoc=" + custLoc
			+ "]";
}

	
	
}
