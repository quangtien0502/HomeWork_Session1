package Additional_HomeWork;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số điện tiêu thụ hàng tháng của bạn");
        int electricityNumber = scanner.nextInt();
        int price = 0;
        if (electricityNumber >= 0 && electricityNumber < 50) {
            price = electricityNumber * 10000;
        } else if (electricityNumber < 100) {
            price = electricityNumber * 15000;
        } else if (electricityNumber < 150) {
            price = electricityNumber * 20000;
        } else if (electricityNumber < 200) {
            price = electricityNumber * 25000;
        } else {
            price = electricityNumber * 30000;
        }
        System.out.println("Số điện của bạn tiêu thụ là "+price);
    }
}
