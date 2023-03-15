package EmpManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) throws Exception{
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<Employee>();
        File file = new File("employee.txt");
        ObjectOutputStream oos = null; // writing object into file
        ObjectInputStream ois = null; // reading object from file
        ListIterator li = null; //  the list to display the data properly

        // check if file exist then load the previous data into list
        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            list = (ArrayList<Employee>)ois.readObject();
            ois.close();
        }

        // Menu driven program
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("0.EXIT");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // case 1 for inserting data into file
                    System.out.println("Enter how many employees you want : ");
                    int n = sc.nextInt();

                    for(int i=0; i<n; i++) {
                        System.out.println("Enter Employee No: ");
                        int empId = sc.nextInt();

                        System.out.println("Enter Employee Name: ");
                        String empName = sc1.nextLine();

                        System.out.println("Enter Employee Salary: ");
                        int salary = sc.nextInt();

                        list.add(new Employee(empId, empName, salary));
                    }
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(list);
                    oos.close();
                    break;
                case 2:
                    // displaying the data from file
                    if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        list = (ArrayList<Employee>)ois.readObject();
                        ois.close();
                        System.out.println("--------------------------------------------");
                        li = list.listIterator();
                        while (li.hasNext()) {
                            System.out.println(li.next());
                        }
                        System.out.println("--------------------------------------------");
                    } else {
                        System.out.println("File not exists...!!");
                    }
                    break;
                case 3:
                    // searching the data from file
                    if (file.isFile()) { // check if file is there or not
                        ois = new ObjectInputStream(new FileInputStream(file));
                        list = (ArrayList<Employee>)ois.readObject();
                        ois.close();

                        Boolean found = false;
                        System.out.println("Enter employee Id to search: ");
                        int empNo = sc.nextInt();
                        System.out.println("--------------------------------------------");
                        li = list.listIterator();
                        while (li.hasNext()) {
                            Employee emp = (Employee)li.next();
                            if (emp.empId == empNo) {
                                System.out.println(emp);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found ...!!");
                        }
                        System.out.println("--------------------------------------------");
                    } else {
                        System.out.println("File not exists...!!");
                    }
                    break;
                case 4:
                    //  deleting the data from file
                    if (file.isFile()) {
                        // check if file is there or not
                        ois = new ObjectInputStream(new FileInputStream(file));
                        list = (ArrayList<Employee>)ois.readObject();
                        ois.close();

                        Boolean found = false;
                        System.out.println("Enter employee Id to delete: ");
                        int empNo = sc.nextInt();
                        System.out.println("--------------------------------------------");
                        li = list.listIterator();
                        while (li.hasNext()) {
                            Employee emp = (Employee)li.next();
                            if (emp.empId == empNo) {
                                li.remove();
                                found = true;
                            }
                        }
                        if (found) {
                            // update the record in file after deletion
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(list);
                            oos.close();
                            System.out.println("Record deleted successfully...!!");
                        } else {
                            System.out.println("Record not found ...!!");
                        }
                        System.out.println("--------------------------------------------");
                    } else {
                        System.out.println("File not exists...!!");
                    }
                    break;
                case  5:
                    if (file.isFile()) {
                        // check if file is there or not
                        ois = new ObjectInputStream(new FileInputStream(file));
                        list = (ArrayList<Employee>)ois.readObject();
                        ois.close();

                        Boolean update = false;
                        System.out.println("Enter employee Id to update: ");
                        int empNo = sc.nextInt();
                        System.out.println("--------------------------------------------");
                        li = list.listIterator();
                        while (li.hasNext()) {
                            Employee emp = (Employee)li.next();
                            if (emp.empId == empNo) {
                                System.out.println("Enter Employee No: ");
                                int empId = sc.nextInt();

                                System.out.println("Enter Employee Name: ");
                                String empName = sc1.nextLine();

                                System.out.println("Enter Employee Salary: ");
                                int salary = sc.nextInt();

                                li.set(new Employee(empId,empName,salary));
//                                li.remove();
                                update = true;
                            }
                        }
                        if (update) {
                            // update the record in file after deletion
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(list);
                            oos.close();
                            System.out.println("Record updated successfully...!!");
                        } else {
                            System.out.println("Record not found ...!!");
                        }
                        System.out.println("--------------------------------------------");
                    } else {
                        System.out.println("File not exists...!!");
                    }
                    break;
                default:
                    // the end of program
                    System.out.println("Thank you!");
            }

        } while (choice!=0);

    }
}
