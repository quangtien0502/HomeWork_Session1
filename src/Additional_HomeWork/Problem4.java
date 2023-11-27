package Additional_HomeWork;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num =1;
        while (num%3==0){
            System.out.println("Hãy nhập vào số của bạn: ");
            num=scanner.nextInt();
            sum=sum+num;

        }
        System.out.println("Tổng của các số vừa nhập là "+sum);
    }
}
