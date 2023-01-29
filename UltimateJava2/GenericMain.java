package UltimateJava2;

import UltimateJava2.EmployeeCode.Employee;

public class GenericMain {

    public static void main(String[] args){
        var employee = new Employee(50_000,20);
        var employee1 = new Employee(50_000);



        int wage = employee.calculateWage(30);

        int wage1 = employee1.calculateWage();

        Employee.printNumberOfEmployees();



        System.out.println(wage1);
        System.out.println(wage);



    }
}
