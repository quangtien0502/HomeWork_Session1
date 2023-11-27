package OnClass;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int sum = 0;
        System.out.println("Nhập vào số của bạn để tính tổng");
        while (a!=0){
            a = scanner.nextInt();
            sum = sum+a;
        }

        System.out.println("Tổng của các số đã nhập là "+sum);
    }
}
