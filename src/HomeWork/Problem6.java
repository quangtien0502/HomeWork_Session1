package HomeWork;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số của bạn");
        int number = Integer.parseInt(scanner.nextLine());
        if(number%5==0 && number%3==0){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (number%5==0 && number%3!=0) {
            System.out.println("Chỉ chia hết cho 5");
        }
        else if (number%5!=0 && number%3==0) {
            System.out.println("Chỉ chia hết cho 3");
        }
    }
}
