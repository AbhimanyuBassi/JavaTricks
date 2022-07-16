package work.predicates;

public class Employee {

    private String ename;
    private double salary;
    private int experience;

    public Employee(String ename, double salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                '}';
    }
}
