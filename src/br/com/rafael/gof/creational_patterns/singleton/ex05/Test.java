package br.com.rafael.gof.creational_patterns.singleton.ex05;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        HourlyEmployee emp2 = new HourlyEmployee();
        SalaryEmployee emp3 = new SalaryEmployee();
        System.out.println(emp1.ENTERPRISE_ID  == emp2.ENTERPRISE_ID);
        System.out.println(emp1.ENTERPRISE_ID == emp3.ENTERPRISE_ID);
    }
}
