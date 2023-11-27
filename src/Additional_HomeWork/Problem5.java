package Additional_HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số của bạn");
        int number= scanner.nextInt();

        System.out.printf("Bảng cứu chương của số %d là",number);
        for (int i=1;i<=9;i++){
            System.out.printf("%d * %d = %d \n",i,number,i*number);
        }

    }
}
