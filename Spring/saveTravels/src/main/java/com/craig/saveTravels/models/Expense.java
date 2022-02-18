package com.craig.saveTravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "expenses")
public class Expense {
	@Id // primary key is going to be auto-generated with "@GeneratedValue"
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// Validations
	@NotNull
	@Size(min = 5, max = 200, message = "Enter error messages here")
	private String expenseName;
	@NotNull
	@Min(value = 5, message = "Expense must be over 5, ya cheap ass")
	private double amount;

	@NotNull
	@Size(min = 5, max = 200, message = "Enter error messages here")
	private String vendor;

	@NotNull
	@Size(min = 5, max = 200, message = "Enter error messages here")
	private String description;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	// Constructors
	public Expense() {
	}

	public Expense(String expenseName, double amount, String vendor, String description) {
		this.expenseName = expenseName;
		this.amount = amount;
		this.vendor = vendor;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	// This will not allow the createdAt column to be updated after creation
	@PrePersist // runs the method right before the object is created
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // runs a method when the object is modified
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
