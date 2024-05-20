package Ex_07;

import Ex_05.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    student.displayData();
                    break;
                case 2:
                    student.inputData();
                    break;
                case 3:
                    System.out.println("Nhập mã học sinh cần sửa: ");
                    String studentCode = scanner.nextLine();
                    if (student.getStudentCode().equals(studentCode)) {
                        student.inputData();
                    } else {
                        System.out.println("Không tìm thấy học sinh có mã " + studentCode);
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã học sinh cần xóa: ");
                    studentCode = scanner.nextLine();
                    if (student.getStudentCode().equals(studentCode)) {
                        student = new Student();
                    } else {
                        System.out.println("Không tìm thấy học sinh có mã " + studentCode);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (choice >= 1 && choice <= 5);
    }
}

