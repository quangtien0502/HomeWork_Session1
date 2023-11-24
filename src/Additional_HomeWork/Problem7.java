package Additional_HomeWork;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn hãy nhập số tự nhiên có 4 chữ số");
        int x = Integer.parseInt(scanner.nextLine());
        int thousand = x/1000;
        int hunred= (x- thousand*1000)/100;
        int ten= (x-thousand*1000-hunred*100)/10;
        int unit = (x-thousand*1000-hunred*100-ten*10);
        int sum = thousand+hunred+ten+unit;
        int reverse= unit*1000+ten*100+hunred*10+thousand;
        System.out.printf("Tổng của các chữ số là %d và số ngược lại của nó là %d",sum,reverse);

    }
}
