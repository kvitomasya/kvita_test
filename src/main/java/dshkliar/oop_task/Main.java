package dshkliar.oop_task;

public class Main {
    public static void main(String[] args) {
        Employee empH1 = new EmployeeWithHourRate(111, "Vasia", 'm', 10, 20.8, 8);
        System.out.println("\nEmployee With Hour Rate: ");
        empH1.printSalary();
        Employee empF1 = new EmployeeWithFixedSalary(222, "Ira", 'f', 10000.0);
        System.out.println("\nEmployee With Fixed Salary: ");
        empF1.printSalary();
    }
}
