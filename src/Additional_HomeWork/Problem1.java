package Additional_HomeWork;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số mà bạn muốn kiểm tra");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Đây là số chẵn");
        }else {
            System.out.println("Đây là số lẻ");
        }
    }
}
