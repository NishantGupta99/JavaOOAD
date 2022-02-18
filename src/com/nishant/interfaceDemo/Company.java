package com.nishant.interfaceDemo;

import java.util.ArrayList;
import java.util.List;  

public class Company {
	public static void main(String[] args) {
		IStaff staff = new Guard();
		IStaff staff1 = new HR();
		
		staff.work(); 
		staff1.work();
		staff1.test1();
	    List<IStaff> allStaff = new ArrayList<IStaff>();
	    allStaff.add(staff);
	    allStaff.add(staff1);
	    System.out.println(allStaff.size());
	    
			
		
				
			
		};
	}


