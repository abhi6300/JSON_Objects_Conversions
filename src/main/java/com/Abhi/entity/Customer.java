package com.Abhi.entity;

import lombok.Data;

@Data
public class Customer {
	
	private Integer customerId;
	private String customerName;
	private String location;
	private String gender;
	private Integer age;

}
