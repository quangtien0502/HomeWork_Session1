package HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number%5!=0 || number%7!=0 || number%11!=0){
            number++;
        }
        System.out.println("UCLN của 3 số này là "+number);
    }
}
