package DesignPatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        //I want to get android developer

        Employee e1 = EmployeeFactory
                .getEmployee(new AndroidDeveloperFactory());
        e1.name();
        System.out.println(e1.salary());

        //I want to get web developer

        Employee e2 = EmployeeFactory
                .getEmployee(new WebDeveloperFactory());
        e2.name();
        System.out.println(e2.salary());

    }
}
