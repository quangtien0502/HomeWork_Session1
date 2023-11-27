package Additional_HomeWork;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        System.out.print("Nhập phép toán (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                    return;
                }
                break;
            default:
                System.out.println("Lỗi: Phép toán không hợp lệ.");
                return;
        }
        System.out.println("Kết quả: " + result);
    }
}
