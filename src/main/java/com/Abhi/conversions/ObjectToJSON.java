package com.Abhi.conversions;

import java.io.File;
import java.io.IOException;

import com.Abhi.entity.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJSON {
	
	public static void covertToJSON(Customer customer,File file) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, customer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
