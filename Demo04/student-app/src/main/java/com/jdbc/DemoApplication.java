package com.jdbc;

import com.jdbc.operation.StudentOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private StudentOperations operations;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n 1. Insert \n 2. Find \n 3. FindAll \n 4. Delete \n 5. Exit");
			int choice = sc.nextInt();

			switch (choice) {
				case 1 -> operations.insertStudent();
				case 2 -> operations.findStudent();
				case 3 -> operations.findAllStudents();
				case 4 -> operations.deleteStudent();
				case 5 -> System.exit(0);
				default -> System.out.println("Invalid choice");
			}
		}
	}
}