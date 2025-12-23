package com.ibm.healthapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Patient> patients = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        

        while (true) {
            System.out.println("\n--- Healthcare Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Patient ID: ");
                int id = sc.nextInt();

                sc.nextLine(); // clear buffer

                System.out.print("Enter Patient Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                sc.nextLine(); // clear buffer

                System.out.print("Enter Disease: ");
                String disease = sc.nextLine();

                Patient p = new Patient(id, name, age, disease);
                patients.add(p);

                System.out.println("Patient added successfully!");

            } else if (choice == 2) {

                if (patients.isEmpty()) {
                    System.out.println("No patient records found.");
                } else {
                    System.out.println("\nPatient List:");
                    for (Patient p : patients) {
                        p.Display();
                    }
                }

            } else if (choice == 3) {
                System.out.println("Exiting Healthcare System...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
	}

