package org.saro;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Institution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		File f=new File("pass.txt");
		System.out.println("Welcome to our Institution");
        List<String> readLines=FilesUtils.readLines(f);
       

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String userPassword = scanner.nextLine();
        for(String x:readLines) {
        
        }
        Object x ="";
		if (x.equals(userPassword)) {
            System.out.println("Password is correct.");
        } 
        else {
            System.out.println("Incorrect password.");
        }
        Teacher t=new Teacher();
    	System.out.println("Enter the teacher id");
        int id=scanner.nextInt();
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.print("Enter teacher position (e.g., Subject Name, Grade Level, etc.): ");
        String position = scanner.nextLine();
        System.out.print("Enter teacher phone number: ");
        long phone = scanner.nextLong();

    	t.setId(id);
    	t.setName(name);
    	t.setPosition(position);
    	t.setPh(phone);
    	
    	Student st=new Student();
    	System.out.println("Enter the Student id");
        int id1=scanner.nextInt();
        System.out.print("Enter Student name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Student phone number: ");
        long phone1 = scanner.nextLong();

     	st.setId(id1);
     	st.setName(name1);
     	st.setPh(phone1);
	}
}