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


        Map<String, EmployeeDetails> topEmployees =
                employeeDetailsList.stream()
                        .collect(groupingBy(
                                e -> e.getDepartment(),
                                collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)
                        ));

        System.out.println(topEmployees);

    }

}
