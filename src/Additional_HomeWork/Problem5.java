package Additional_HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập độ dài cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh c: ");
        double c = scanner.nextDouble();


        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Đây là tam giác.");

            if (a == b && b == c) {
                System.out.println("Tam giác đều.");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                    System.out.println("Tam giác vuông cân.");
                } else {
                    System.out.println("Tam giác cân.");
                }
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                System.out.println("Tam giác vuông.");
            } else {
                System.out.println("Tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh này không tạo thành tam giác.");
        }
    }
}
