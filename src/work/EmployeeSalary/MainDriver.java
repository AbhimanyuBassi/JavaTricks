package work.EmployeeSalary;


import work.predicates.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Kate", 25000, 15));
        employeeList.add(new Employee("John", 55000, 10));
        employeeList.add(new Employee("Peter", 28000, 20));
        employeeList.add(new Employee("Jack", 25000, 5));

        System.out.println(employeeList);

        List<Employee> hikedEmpList = employeeList.stream().map(e -> {
            if (e.getExperience() > 10) {
                e.setSalary(e.getSalary() * 1.1);
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(hikedEmpList);


    }
}
