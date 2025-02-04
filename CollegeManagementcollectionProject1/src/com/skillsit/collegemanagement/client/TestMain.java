package com.skillsit.collegemanagement.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skillsit.collegemanagement.model.Batch;
import com.skillsit.collegemanagement.model.Course;
import com.skillsit.collegemanagement.model.Faculty;
import com.skillsit.collegemanagement.model.Student;
import com.skillsit.collehgemanagement.serviceImpl.Karvenagar;

public class TestMain {
       
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Karvenagar kn=new Karvenagar();
		
		
		List<Course> clist = new ArrayList<>();
		List<Faculty> flist = new ArrayList<>();
		List<Batch> blist = new ArrayList<>();
		List<Student> slist = new ArrayList<>();
		
		while(true) {
			
			System.out.print("1.Add Course");
			System.out.println("   2.View Course");
			System.out.print("3.Add Faculty");
			System.out.println("  4.View Faculty");
			System.out.print("5.Add Batch");
			System.out.println("    6.View Batch");
			System.out.print("7.Add Student");
			System.out.println("  8.View Student");
			System.out.println("       9.Exit");
			
			System.out.println("---------------------------");
			
			System.out.println("Enter Your choice - ");
			int ch=sc.nextInt();
			
			
			switch(ch) {
			
			case 1:
				kn.addCourse();
				break;
			case 2:
				kn.viewCourse();
				System.out.println("______________________");
				break;
			case 3:
				kn.addFaculty();
				break;
			case 4:
				kn.viewFaculty();
				System.out.println("______________________");
				break;
			case 5:
				kn.addBatch();
				break;
			case 6:
				kn.viewBatch();
				System.out.println("______________________");
				break;
			case 7:
				kn.addStudent();
				break;
			case 8:
				kn.viewStudent();
				System.out.println("______________________");
				break;
			case 9:
				System.out.println("Exiting....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				
			
			}
			
			
		}
		
		
		
	}
}
