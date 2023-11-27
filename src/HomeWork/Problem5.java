package HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        int number = 1;
        while (number%5!=0 || number%7!=0 || number%11!=0){
            number++;
        }
        System.out.println("BCNN(5,7,11) "+number);
    }
}
