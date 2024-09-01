import controllers.UserController;
import entities.Customer;
import entities.Employee;
import entities.User;


import java.util.Scanner;

public class UserManagementMenu {
    private UserController userController;

    public UserManagementMenu() {
        this.userController = new UserController();
    }

    public void showMainMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Quản lý người dùng");
            System.out.println("2. Thoát");
            System.out.println("Chọn khác: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    showUserManagementMenu();
                    break;
                case 2:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (choice != 2);
    }

    private void showUserManagementMenu() {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Tạo người dùng");
            System.out.println("2. Cập nhật người dùng");
            System.out.println("3. Xem thông tin người dùng");
            System.out.println("4. Xóa người dùng");
            System.out.println("5. Hiển thị tất cả người dùng");
            System.out.println("6. Quay lại");
            System.out.println("Chọn khác: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    showCreateUserMenu();
                    break;
                case 2:
                    showUpdateUserMenu();
                    break;
                case 3:
                    showReadUserMenu();
                    break;
                case 4:
                    showDeleteUserMenu();
                    break;
                case 5:
                    userController.showAll();
                    break;
                case 6:
                    System.out.println("Quay lại menu chính");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại");
            }
        } while (choice != 6);
    }

    private void showDeleteUserMenu() {
        System.out.print("Mã người dùng (ID) cần xóa: ");
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();

        User deletingUser = new Employee();
        deletingUser.setId(id);
        userController.delete(deletingUser);
    }

    private void showReadUserMenu() {
        System.out.print("Mã người dùng (ID): ");
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();

        User readingUser = new Employee();
        readingUser.setId(id);
        userController.read(readingUser);
    }

    private void showUpdateUserMenu() {
        System.out.println("1. Cập nhật nhân viên:");
        System.out.println("2. Cập nhật khách hàng");
        System.out.println("Chọn khác: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Mã số người dùng (ID) cần cập nhật: ");
        String id = input.nextLine();
        System.out.print("Tạo mật khẩu mới: ");
        String password = input.nextLine();
        System.out.print("Tạo tên mới: ");
        String name = input.nextLine();

        if (choice == 1) {
            System.out.print("Nhập vai trò mới (0: Nhân viên quản lý, 1: Nhân viên thường: ");
            int role = input.nextInt();
            System.out.print("Nhập lương cơ bản mới: ");
            int baseSalary = input.nextInt();
            System.out.print("Nhập hệ số lương mới: ");
            double coefficientsSalary = input.nextDouble();
            input.nextLine();
            Employee employee = new Employee(id, password, name, role, baseSalary, coefficientsSalary);
            userController.update(employee);
        } else if (choice == 2) {
            System.out.print("Nhập điểm thưởng mới: ");
            int point = input.nextInt();
            input.nextLine();
            Customer customer = new Customer(id, password, name, 2, point);
            userController.update(customer);
        } else {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại");
        }
    }

    private void showCreateUserMenu() {
        System.out.println("1. Tạo nhân viên");
        System.out.println("2. Tạo khách hàng");
        System.out.println("Chọn khác: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Tạo mã số (ID) người dùng: ");
        String id = input.nextLine();
        System.out.print("Tạo mật khẩu: ");
        String password = input.nextLine();
        System.out.print("Tạo tên người dùng: ");
        String name = input.nextLine();

        if (choice == 1) {
            System.out.print("Nhập vai trò (0: Nhân viên quản lý, 1: Nhân viên thường");
            int role = input.nextInt();
            System.out.print("Nhập lương cơ bản: ");
            int baseSalary = input.nextInt();
            System.out.print("Nhập hệ số lương: ");
            double coefficientsSalary = input.nextDouble();
            input.nextLine();
            Employee employee = new Employee(id, password, name, role, baseSalary, coefficientsSalary);
            userController.create(employee);
        } else if (choice == 2) {
            System.out.print("Nhập điểm thưởng: ");
            int point = input.nextInt();
            input.nextLine();

            Customer customer = new Customer(id, password, name, 2, point);
            userController.create(customer);
        } else {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại");
        }
    }
}
