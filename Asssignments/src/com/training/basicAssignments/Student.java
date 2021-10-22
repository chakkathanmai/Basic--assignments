package com.training.basicAssignments;

import java.lang.reflect.Array;

public class Student {
      String name;
      int studentId;
      
      
	public Student(String name, int studentId) {
		
		this.name = name;
		this.studentId = studentId;
	}
      
	void getDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Id:"+studentId);
	}
	
	void getGrades(int [] marks ) {
		/* System.out.println(marks); */
		int sum=0,average;
		for(int num:marks) {
			sum+=num;
		}
		average=sum/marks.length;
		
		/* System.out.println(); */
		System.out.println("Total marks of Student : "+sum); 
		 System.out.println("Average : "+average);
		
		 if(sum<40) {
				System.out.println("C grade");
			}else if(sum<70 ) {
				System.out.println("B grade");
			}else if(sum>70){
				System.out.println("A grade");
			}
		 System.out.println();
		
		
	}
	}
      

