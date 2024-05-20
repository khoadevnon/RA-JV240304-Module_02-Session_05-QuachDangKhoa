package Ex_05;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private boolean gender;
    private String studentAddress;
    private String phoneNumber;

    public Student() {
    }

    public Student(String studentCode, String studentName, int age, boolean gender, String studentAddress, String phoneNumber) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.studentAddress = studentAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã học sinh: ");
        studentCode = sc.nextLine();
        System.out.println("Nhập tên học sinh: ");
        studentName = sc.nextLine();
        System.out.println("Nhập tuổi học sinh: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính học sinh (Nam/Nữ): ");
        gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập địa chỉ học sinh: ");
        studentAddress = sc.nextLine();
        System.out.println("Nhập số điện thoại học sinh: ");
        phoneNumber = sc.nextLine();
    }
    public void displayData() {
        System.out.println("Student Code: " + studentCode);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Phone Number: " + phoneNumber);
    }

}

