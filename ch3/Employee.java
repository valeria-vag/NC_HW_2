package com.netcracker.ch3;

public class Employee implements Measurable {
    private String firstName;
    private String secondName;
    private double salary;

    public Employee(String firstName, String secondName, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSalary() {
        return salary;
    }

    public static double avg(Measurable[] objects) {
        int size = objects.length;
        double sum = 0;
        for (Measurable item : objects) {
            sum += item.getMeasure();
        }
        return size == 0 ? 0 : sum / size;
    }
    public static double largest(Measurable[] obj){
        double result = 0;

        for (Measurable item : obj) {
            if (Double.compare(item.getMeasure(), result)==1)
            {
                result = item.getMeasure();
            }
        }
        return result;
    }

    @Override
    public String getName() {
        return firstName + " " + secondName;
    }

    public String toString() {
        return "Employee [" +
                ", name = " + getName() +
                ", salary = " + salary +
                ']';
    }
}
