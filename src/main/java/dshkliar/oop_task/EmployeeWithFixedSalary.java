package dshkliar.oop_task;

public class EmployeeWithFixedSalary extends Employee implements Salary {

    EmployeeWithFixedSalary(int id, String name, char sex, double salary) {
        super(id, name, sex, salary);
    }

    public double calculateSalary() {
        return salary;
    }

    public void printSalary() {
        System.out.println("\tname: " + name + ";\n\tsex: " + sex + ";\n\tID: " + id + ";\n\tsalary: " + calculateSalary());
    }
}
