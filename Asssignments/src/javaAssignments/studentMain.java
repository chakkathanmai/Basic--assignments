package javaAssignments;
import java.util.Scanner;
public class studentMain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 1st Studentname");
		 String student1_name=sc.next();
		 System.out.println("Enter the 1st studentId");
		 int student1_id=sc.nextInt();
		 
		 System.out.println("Enter the 2nd Studentname");
		   String student2_name=sc.next();
		   System.out.println("Enter the 2nd studentId");
		   int student2_id=sc.nextInt();
		   
		   
		   System.out.println("Enter the number of subjects");
		    int numberOfSubjects=sc.nextInt();
		    int array1[]=new int[numberOfSubjects];
		    int array2[]=new int[numberOfSubjects];
		    
		   System.out.println("Enter the marks of student 1");
		  
		   for(int i=0;i<numberOfSubjects;i++) {
			   array1[i]=sc.nextInt();
		   }
		   
		   System.out.println("Enter the marks of student 2");
			  
		   for(int i=0;i<numberOfSubjects;i++) {
			   array2[i]=sc.nextInt();
		   }
		    
		 Student student1=new Student(student1_name,student1_id);
		 student1.getDetails();
		 student1.getGrades(array1);
		 
		 Student student2=new Student(student2_name,student2_id);
		 student2.getDetails();
		 
		 
		 student2.getGrades(array2);
	}

}
