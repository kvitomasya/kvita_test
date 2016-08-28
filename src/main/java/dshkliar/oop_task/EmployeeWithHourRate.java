package dshkliar.oop_task;

public class EmployeeWithHourRate extends Employee implements Salary {

    EmployeeWithHourRate(int id, String name, char sex, int hourRate, double rate, int hours) {
        super(id, name, sex, hourRate, rate, hours);
    }

    public double calculateSalary() {
        salary = rate * hours * hour_rate;
        return salary;
    }

    public void printSalary() {
        System.out.println("\tname: " + name + ";\n\tsex: " + sex + ";\n\tID: " + id + ";\n\tsalary: " + calculateSalary());
    }
}