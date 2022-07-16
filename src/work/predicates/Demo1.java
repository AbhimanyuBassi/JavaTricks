package work.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {

        //Example 1
        System.out.println("Example 1");
        Predicate<Integer> myobj = i->(i>10);
        System.out.println(myobj.test(2)); //false
        System.out.println(myobj.test(20)); //true

        //Example 2
        System.out.println("Example 2");
        Predicate<String> myStr = s->(s.length()>4);
        System.out.println(myStr.test("Welcome")); //true
        System.out.println(myStr.test("ab")); //false

        //Example 3
        System.out.println("Example 3");
        String names[] ={"David","Ranveer","John","Jani"};
        for(String name:names) {
        if(myStr.test(name))
            System.out.println(name);
        }

        //Example 4
        System.out.println("Example 4");
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Ranveer",50000,2));
        employeeList.add(new Employee("John",60000,6));
        employeeList.add(new Employee("Abhi",200000,12));
        employeeList.add(new Employee("Kate",50000,3));

      /*  Predicate<Employee> emp = e->(e.experience>3 && e.salary>25000);
        for (Employee e: employeeList) {
            if(emp.test(e))
                System.out.println(e.ename);
        }*/



    }
}
