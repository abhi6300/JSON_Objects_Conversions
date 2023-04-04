package com.Abhi.client;

import java.io.File;
import java.io.IOException;

import com.Abhi.conversions.JSONToObject;
import com.Abhi.conversions.ObjectToJSON;
import com.Abhi.entity.Customer;
import com.fasterxml.jackson.databind.DatabindException;

public class Tester {
	
	public static void main(String[] args) throws Exception {
		
		/*
		Customer customer = new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("Soni");
		customer.setGender("Female");
		customer.setLocation("tirupathi");
		customer.setAge(19);
		
		ObjectToJSON.covertToJSON(customer, file);
		System.out.println("Oject inserted to json....");
		*/
		
		File file = new File("D:\\Core-WorkSpace-Spring\\customer.json");
		
		JSONToObject.convertToObject(file);
	
	
	}

}
