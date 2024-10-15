package src;

import java.util.Scanner;

public class Sudentid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		
		int id = scan.nextInt();
		System.out.println("Id is =:"+id);
		scan.nextLine();
		System.out.println("Enter Student Name:= ");
		String name = scan.nextLine();
		System.out.println("Stedent Name is : " + name);
		
		
		System.out.println("Enter Student Roll Number: ");
		int roll = scan.nextInt();
		System.out.println("Student roll= " + roll);
		
		System.out.println("Enter Student Mobile");
		int mobile = scan.nextInt();
		System.out.println("Student Mbile : " + mobile);
	}
	
	}
	
