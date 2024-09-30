package DesignPatterns.AbstractFactory;

import com.code.DesignPatterns.AbstractFactory.Employee;
import com.code.DesignPatterns.AbstractFactory.EmployeeAbstractFactory;

public class WebDeveloperFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
