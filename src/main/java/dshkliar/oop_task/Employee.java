package dshkliar.oop_task;

public abstract class Employee {

    protected String name;
    protected char sex;
    protected int id;
    protected double salary;
    protected int hour_rate;
    protected double rate;
    protected int hours;


    Employee(int id, String name, char sex, int hourRate, double rate, int hours) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hour_rate = hourRate;
        this.rate = rate;
        this.hours = hours;
    }

    Employee(int id, String name, char sex, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public abstract void printSalary();
}