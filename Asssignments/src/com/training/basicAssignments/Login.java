package com.training.basicAssignments;
import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String[] userNames = new String[] { "thanmai", "sharmila", "divya", "mallika" };
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name to rigister");
				String userName = sc.next();
				int count = 0;
				for (String name : userNames) {
					if (userName.equals(name)) {
						count = 1;
					}
				}
				if(count==1) {
					System.out.println("Your are logged in successfully");
				}else {
					System.out.println("Invalid username");
				}

			}
	}


