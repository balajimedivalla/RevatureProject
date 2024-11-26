package Genericsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
    }
}

public class StreamApi {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Alice", "gmail", 60000),
                new Employee("Bob", "yahoo", 456000),
                new Employee("Eve", "odd", 123)
        ));

        // Adding a new employee
        employees.add(new Employee("A", "b", 123));

        // Filtering employees with salary > 7500 and sorting by salary
        List<String> result = employees.stream()
        	    .filter(e -> e.getSalary() > 7500)
        	    .sorted(Comparator.comparing(Employee::getSalary))
        	    .map(e -> String.valueOf(e.getSalary()))  // Convert salary to String
        	    .collect(Collectors.toList());

        // Printing the result  an a functional interface have more than one abstract method?
        result.forEach(System.out::println);
    }
}
