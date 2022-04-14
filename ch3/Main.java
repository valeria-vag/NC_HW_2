package com.netcracker.ch3;

import static com.netcracker.ch3.Employee.avg;
import static com.netcracker.ch3.Employee.largest;

public class Main {
    public static void main(String[] args) {
        employeeTest();
    }

    public static void employeeTest() {
        System.out.println("EMPLOYEE TEST");

        Measurable employee1 = new Employee("Gerard", "Pique", 725000);
        Measurable employee2 = new Employee("Ansu", "Fati",434000);
        Measurable employee3 = new Employee("Dani", "Alves", 532200);

        Measurable[] employers = new Measurable[3];

        employers[0] = employee1;
        employers[1] = employee2;
        employers[2] = employee3;

        System.out.println("Average salary is " + avg(employers));
        System.out.println("Largest salary is " + largest(employers));

        System.out.println("================================================");
    }
}
