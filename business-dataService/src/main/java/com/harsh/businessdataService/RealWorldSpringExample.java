package com.harsh.businessdataService;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harsh.businessdataService.allData.BusinessCalculationService;
import com.harsh.businessdataService.allData.DataService;
import com.harsh.businessdataService.allData.MySQLDataService;

@Configuration
@ComponentScan("com.harsh.businessdataService.allData")
public class RealWorldSpringExample {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(RealWorldSpringExample.class)){
			
			var mongoData = context.getBean(BusinessCalculationService.class);
			System.out.println("Primary max data :- "+mongoData.findMax());
			
			var mySQLData = context.getBean(MySQLDataService.class);
			System.out.println("MySQL data :- "+Arrays.toString(mySQLData.retrieveData()));
			
			var data = context.getBean(DataService.class);
			System.out.println("Primary Data :- "+Arrays.toString(data.retrieveData()));
			
		}
	}
}
