package com.info.policy.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Policy {
	
	@Id
	private int policyNumber;
	private String firstName;
	private String lastName;
	private String startDate;
	private String endDate;
	private BigDecimal deductible;
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getDeductible() {
		return deductible;
	}
	public void setDeductible(BigDecimal deductible) {
		this.deductible = deductible;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", deductible=" + deductible + "]";
	}
	
		
	
}
