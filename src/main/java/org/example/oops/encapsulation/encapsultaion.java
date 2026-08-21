package org.example.oops.encapsulation;

// Encapsulation means wrapping of data and methods into a single unit and restricting the direct access
// We can achieve encapsulation my making private keyword

public class encapsultaion {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        System.out.println("ID : " +  employee.getId());

        employee.setName("Dishant");
        System.out.println("Name : " + employee.getName());

        employee.setCompanyName("Capegemini");
        System.out.println("Company Name : " + employee.getCompanyName());

        employee.setLocation("Mumbai");
        System.out.println("Location : " + employee.getLocation());

    }
}
