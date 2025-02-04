package com.skillsit.collehgemanagement.serviceImpl;


import java.util.ArrayList;


import java.util.List;
import java.util.Scanner;

import com.Exception.duplicateidException;

import com.skillsit.collegemanagement.model.Batch;
import com.skillsit.collegemanagement.model.Course;
import com.skillsit.collegemanagement.model.Faculty;
import com.skillsit.collegemanagement.model.Student;
import com.skillsit.collegemanagement.service.sit;

public class Karvenagar implements sit {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	
	
	//Batch b=new Batch();
	

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.println("Enter Course Id- ");
		int id = sc.nextInt();

		boolean ispresent=false;
		for(Course obj:clist) {
			try
			{
					if(obj.getCid()==id) {
						
						//System.out.println("id already present");
					    ispresent=true;
					    throw new duplicateidException();
					    
					}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.err.println(e.getMessage());
				break;
			}
			
			
		}
		if(!ispresent){
			c.setCid(id);	
			
		System.out.println("Enter Course Name - ");
		String cname = sc.next();
        
		c.setCname(cname);
		clist.add(c);
		System.out.println("record added successfully");
		
		}
	}

	@Override
	public void viewCourse() {
       
		System.out.println(clist);

	}

	@Override
	public void addFaculty() {
		
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Id- ");
		int fid = sc.nextInt();

		boolean ispresent=false;
		for(Faculty obj:flist) {
			
			try {
			if(obj.getId()==fid) {
				
			    ispresent=true;
			    throw new duplicateidException();
			}
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
				break;
			}
			
		}
		
        if(!ispresent) {
		System.out.println("Enter Faculty Name - ");
		String fname = sc.next();

		f.setFname(fname);
		f.setId(fid);
		
		

		System.out.println("Enter Course name :");
		String fcourse = sc.next();
        boolean flag=false;
		for (Course obj : clist) {
			if (obj.getCname().equalsIgnoreCase(fcourse)) {

				f.setCourse(obj);
				flist.add(f);
				flag=true;
				System.out.println("Faculty is Added to the Course");

			}
		}
		if(!flag) {
			System.out.println("Course not found ");
		}
		
        }
		

	}

	@Override
	public void viewFaculty() {
       
		System.out.println(flist);

	}

	@Override
	public void addBatch() {
		Batch b=new Batch();
		System.out.println("Enter batch id - ");
		int bid=sc.nextInt();
		

		boolean ispresent=false;
		for(Batch obj:blist) {
			try {
			
			if(obj.getBid()==bid) {
				
			    ispresent=true;
			    throw new duplicateidException();
			}
			}catch (Exception e) {
				System.err.println(e.getMessage());
				break;
			}
			
		}
		
		if(!ispresent) {
		System.out.println("Enter batch Name - ");
		String bname=sc.next();
		
		b.setBid(bid);
		b.setBname(bname);
		
		System.out.println("Enter Faculty name -");
		String fname=sc.next();
		boolean flag=false;
		for(Faculty obj:flist) {
			if(obj.getFname().equalsIgnoreCase(fname)) {
				
				b.setFaculty(obj);
				blist.add(b);
				System.out.println("Faculty added Successfully to batch");
				flag=true;
			}
			
			
			
		}
		if(!flag) {
			System.out.println("Faculty not found");
		}
		
		}
		
	}
	
	@Override
	public void viewBatch() {
		System.out.println(blist);
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		System.out.println("Enter Student Id- ");
		int sid = sc.nextInt();

		boolean ispresent=false;
		for(Student obj:slist) {
			
			try {
			if(obj.getSid()==sid) {
			    ispresent=true;
			    
			    throw new duplicateidException();
			}
			}catch (Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
		
        if(!ispresent) {
		System.out.println("Enter Student Name - ");
		String sname = sc.next();

		System.out.println("Enter Batch Name - ");
		String bname = sc.next();
        
		s.setSid(sid);
		s.setSname(sname);
		
		for (Batch obj : blist)
		{
			
			if (obj.getBname().equalsIgnoreCase(bname)) {
				s.setBatch(obj);
				slist.add(s);
			} else {
				System.out.println("Batch not present");
			}
			
		
			}
	}
	}

	@Override
	public void viewStudent() {
		System.out.println(slist);

	}

}
