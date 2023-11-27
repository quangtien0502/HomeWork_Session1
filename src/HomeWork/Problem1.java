package HomeWork;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập số chặn đầu");
        int start = scanner.nextInt();
        System.out.println("Hãy nhập số chặn đuôi");
        int end = scanner.nextInt();

        int sum = 0;
        for(int i = start; i<end+1;i++){
            if(i%2==0){
               sum= sum+i;
            }
        }
        System.out.println("Tổng của các số chẵn trong khoảng đó là "+sum);
    }
}
