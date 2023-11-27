package Additional_HomeWork;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();


        System.out.println("Nhập tháng (1-12): ");
        int month = scanner.nextInt();



        int daysInMonth = getDaysInMonth(year, month);
        if (daysInMonth != -1) {
            System.out.println("Tháng " + month + " năm " + year + " có " + daysInMonth + " ngày.");
        } else {
            System.out.println("Tháng không hợp lệ.");
        }

        System.out.println("Tháng " + month + " năm " + year + " có " + daysInMonth + " ngày.");
    }

    private static int getDaysInMonth(int year, int month) {
        if (year < 1 || month < 1 || month > 12) {
            return -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
