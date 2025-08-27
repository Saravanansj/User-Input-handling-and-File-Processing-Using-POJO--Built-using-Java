package org.saro;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Institution {

    public static void main(String[] args) throws IOException {

        File f = new File("pass.txt");
        System.out.println("Welcome to our Institution");

        // Read passwords from file
        List<String> readLines = FilesUtils.readLines(f);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        // Check password
        boolean matched = false;
        for (String line : readLines) {
            if (line.equals(userPassword)) {
                matched = true;
                break;
            }
        }

        if (!matched) {
            System.out.println("Incorrect password. Access Denied!");
            scanner.close();
            return; // stop execution
        }
        System.out.println("Password is correct. Access Granted!");

        // Enter Teacher Details
        Teacher t = new Teacher();
        System.out.print("Enter Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Teacher Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Teacher Phone: ");
        long phone = scanner.nextLong();

        t.setId(id);
        t.setName(name);
        t.setPosition(position);
        t.setPh(phone);

        System.out.println("\nTeacher details saved: " + t);

        // Enter Student Details
        Student st = new Student();
        System.out.print("\nEnter Student ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Student Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Student Phone: ");
        long phone1 = scanner.nextLong();

        st.setId(id1);
        st.setName(name1);
        st.setPh(phone1);

        System.out.println("\nStudent details saved: " + st);

        scanner.close();
    }
}
