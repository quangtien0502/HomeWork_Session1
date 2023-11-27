package HomeWork;

import java.util.Scanner;

public class Problem4 {
    public static boolean checkPrimeNumber(int x) {
        if(x<1){
            return false;
        } else if (x==2) {
            return true;
        } else if (x>2) {
            for(int i=2;i<x;i++){
                if(x%i==0){
                    return false;

                }



            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào số số nguyên tố mà bạn muốn in ra");
        int numbers = scanner.nextInt();
        int count = 0;
        int primeNumber = 1;
        while (count<numbers){
            while (checkPrimeNumber(primeNumber)==false){
                primeNumber++;

            }
            System.out.println(primeNumber);
            primeNumber++;
            count++;
        }
    }
}
