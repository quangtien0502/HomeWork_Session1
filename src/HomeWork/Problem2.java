package HomeWork;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        final double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng tiền USD bạn muốn quy đổi sang VND là:");
        double money = Double.parseDouble(scanner.nextLine());
        double convertedMoney = money*rate;
        System.out.printf("Giá trị của %.2f%n USD trong VND là %.2f%n",money,convertedMoney);
    }
}
