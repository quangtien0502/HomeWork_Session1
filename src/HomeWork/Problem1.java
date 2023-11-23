package HomeWork;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập khoảng chặn đầu: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập khoảng chặn đuôi: ");
        int end = Integer.parseInt(scanner.nextLine());
        int allEvenSum = 0;
        for (int i = start; i < end + 1; i++) {
            if(i%2==0){
                allEvenSum = i+allEvenSum;
            }
        }
        System.out.printf("Tổng của các số chẵn trong khoảng đã cho là: %d",allEvenSum);
    }
}