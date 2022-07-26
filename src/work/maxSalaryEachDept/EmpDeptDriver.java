package work.maxSalaryEachDept;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class EmpDeptDriver {

    public static void main(String[] args) {
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();

        employeeDetailsList.add(new EmployeeDetails("Jack", "HR", 25000));
        employeeDetailsList.add(new EmployeeDetails("Paul", "HR", 35000));
        employeeDetailsList.add(new EmployeeDetails("Pia", "HR", 15000));
        employeeDetailsList.add(new EmployeeDetails("Amber", "Tech", 15000));
        employeeDetailsList.add(new EmployeeDetails("Creed", "Tech", 15000));
        employeeDetailsList.add(new EmployeeDetails("Tom", "Tech", 15000));

        //This code creates a Stream of all the employees and groups them with their department with the help of Collectors.groupingBy.
        // For all the values classified to the same key, we need to keep only the employee with the maximum salary,
        // so we collect them with Collectors.maxBy and the comparator compares the salary with Comparator.comparingInt.
        // Since maxBy returns an Optional<Employee> (to handle the case where there the list is empty),
        // we wrap it with a call to Collectors.collectingAndThen with a finisher that just returns the employee:
        // we know in this case that the optional won't be empty.

        Map<String, EmployeeDetails> topEmployees =
                employeeDetailsList.stream()
                        .collect(groupingBy(
                                e -> e.getDepartment(),
                                collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)
                        ));

        System.out.println(topEmployees);

    }

}
