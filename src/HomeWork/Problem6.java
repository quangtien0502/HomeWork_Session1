package HomeWork;

import java.util.Scanner;

public class Problem6 {
    public static boolean checkPrimeNumber(int x) {
        if (x < 1) {
            return false;
        } else if (x == 2) {
            return true;
        } else if (x > 2) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;

                }


            }
            return true;
        }
        return false;

    }


    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số mà bạn muốn kiểm tra ");
            int number = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:


                    if (number%2==0) {
                        System.out.println("Số đã cho là số chẵn");
                    } else {
                        System.out.println("Số đã cho là số lẻ");
                    }

                    break;

                case 2:

                    boolean isPrime = checkPrimeNumber(number);
                    if (isPrime == true) {
                        System.out.println("Số đã cho là số nguyên tố");
                    } else {
                        System.out.println("Số đã cho không là số nguyên tố");
                    }

                    break;
                case 3:


                    if (number%3==0) {
                        System.out.println("Số đã cho chia hết cho 3");
                    } else {
                        System.out.println("Số đã cho không chia hết cho 3");
                    }

                    break;

                case 4:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Hãy chọn các lựa chọn từ 1 tới 4");

            }
        }
    }
}
