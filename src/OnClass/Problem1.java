package OnClass;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số của bạn");
        int number = scanner.nextInt();
        int soDu = number%5;
        if(soDu==0){
            System.out.printf("%d chia hết cho 5",number);
        }else {
            System.out.printf("%d chia 5 dư %d",number,soDu);
        }

    }
}
