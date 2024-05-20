package Ex_02;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        employeeId = scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        employeeName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính (Nam: true, Nữ: false): ");
        gen = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập hệ số lương: ");
        rate = Double.parseDouble(scanner.nextLine());
    }

    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + (gen ? "Nam" : "Nữ"));
        System.out.println("Hệ số lương: " + rate);
    }

    public void calSalary() {
        salary = rate * 1300000;
        System.out.println("Lương: " + salary);
    }
}