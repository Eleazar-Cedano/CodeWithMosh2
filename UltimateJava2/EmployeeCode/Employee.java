package UltimateJava2.EmployeeCode;

import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.*;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    } // Constructor Employee()

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);

    } // end printNumberOfEmployees()

    public int calculateWage(int extraHours) {

        return (int) (baseSalary + (extraHours * hourlyRate));
    } //ends calculateWage(int extraHours) {
    public int calculateWage() {
        return calculateWage(0);
    } //ends calculateWage().

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    } // ends setHourlyRate()


    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;

    } // ends setBaseSalary()

     void getHourlyRate(){
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en","us")).format(hourlyRate));
    } // ends getHourlyRate

     void getBaseSalary(){
        System.out.println(NumberFormat.getCurrencyInstance(new Locale("en","us")).format(baseSalary));
    } // ends getBaseSalary()


} // ends Employee() Class

