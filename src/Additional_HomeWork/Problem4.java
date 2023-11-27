package Additional_HomeWork;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        if(number%3==0 && number%5==0){
            System.out.println("Số chia hết cho cả 3 và 5");
        }
        else {
            System.out.println("Số đã cho không chia hết cho 3 và 5");
        }


    }
}
