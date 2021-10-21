package EmployeeDetails;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String name, id, address, depertment_name, birthday;
        int depertment_id, gread, employee_number;
        double salary;

        System.out.print("Enter The Number Of Employee : ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        employee_number = input.nextInt();

        Employee[] employee = new Employee[employee_number];
        System.out.print("\nEnter Employee Details One By One : ");

        for (int i = 0; i < employee_number; i++) {
            employee[i] = new Employee();

            System.out.print("\n\tEnter The ID Of No \'" + (i + 1) + "\' Employer : ");
            id = input.next();
            employee[i].setId(id);

            System.out.print("\tEnter The Name Of No \'" + (i + 1) + "\' Employer : ");
            name = input.next();
            employee[i].setName(name);

            System.out.print("\tEnter The Depertment ID Of No \'" + (i + 1) + "\' Employer : ");
            depertment_id = input.nextInt();
            employee[i].setDepertment_id(depertment_id);

            System.out.print("\tEnter The Depertment Name Of No \'" + (i + 1) + "\' Employer : ");
            depertment_name = input.next();
            employee[i].setDepertment_name(depertment_name);

            System.out.print("\tEnter The Gread Of No \'" + (i + 1) + "\' Employer : ");
            gread = input.nextInt();
            employee[i].setGread(gread);

            System.out.print("\tEnter The Salary Of No \'" + (i + 1) + "\' Employer : ");
            salary = input.nextDouble();
            employee[i].setSalary(salary);

            System.out.print("\tEnter The Birthday Of No \'" + (i + 1) + "\' Employer : ");
            birthday = input.next();
            employee[i].setBirthday(birthday);

            System.out.print("\tEnter The Address Of No \'" + (i + 1) + "\' Employer : ");
            address = input.next();
            employee[i].setAddress(address);
        }
        boolean isError = true;
        do {
            try {
                int option;
                do {

                    System.out.println("\n");
                    System.out.println("1. Showing Employee Details By Id. ");
                    System.out.println("2. Showing Employee Details According The Depertment. ");
                    System.out.println("3. Employee Details Who Has The Highest Salary.");
                    System.out.println("4. Employee Details Who Holds The Lowest Gread.");
                    System.out.println("0. End The Program.");
                    System.out.print("Enter Your Option : ");
                    option = input.nextInt();                    
                                      
                    
                    //Answer To The Question Number 2.
                    if (option == 1) {
                        System.out.print("\nEnter The Employee Id : ");
                        String temp_id = input.next();
                        int count;

                        for (int i = 0; i < employee_number; i++) {
                            if (temp_id.equals(employee[i].getId())) {
                                count = i;
                                System.out.println("\nEmployee Details : ");
                                employee[count].display();
                            }
                        }
                    }

                    //Answer To The Question Number 3.
                    if (option == 2) {
                        Arrays.sort(employee);
                        for (int i = 0; i < employee_number; i++) {
                            System.out.println("");
                            employee[i].display();
                        }
                    }

                    //Answer To The Question Number 4.
                    if (option == 3) {
                        int maximum_salary_index = 0;
                        double maximum_salary = employee[0].getSalary();

                        for (int i = 0; i < employee_number; i++) {
                            if (maximum_salary < employee[i].getSalary()) {
                                maximum_salary = employee[i].getSalary();
                                maximum_salary_index = i;
                            }
                        }
                        System.out.println("\nEmployee With Highest Sallary : ");
                        System.out.println("ID : " + employee[maximum_salary_index].getId());
                        System.out.println("Name : " + employee[maximum_salary_index].getName());
                        System.out.println("Salary : " + employee[maximum_salary_index].getSalary());

                    }

                    //Answer To The Question Number 5.
                    if (option == 4) {
                        int lowest_gread_index = 0;
                        double lowest_gread = employee[0].getGread();

                        for (int i = 0; i < employee_number; i++) {
                            if (lowest_gread > employee[i].getGread()) {
                                lowest_gread = employee[i].getGread();
                                lowest_gread_index = i;
                            }
                        }
                        System.out.println("\nEmployee With Lowest Gerad : ");
                        System.out.println("ID : " + employee[lowest_gread_index].getId());
                        System.out.println("Name : " + employee[lowest_gread_index].getName());
                        System.out.println("Gread : " + employee[lowest_gread_index].getGread());
                    }
                } while (option != 0);

                isError = false;
            } catch (Exception e) {
                System.out.println("\nPlese Enter Value In Integer Type!");
            }
        } while (isError == true);

    }
}
