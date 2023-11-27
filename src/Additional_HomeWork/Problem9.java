package Additional_HomeWork;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();


        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();

        if(a<b && b<c){
            System.out.printf("Số nhỏ nhất: %d \nSố lớn nhì: %d \nSố lớn nhất: %d ",a,b,c);
        } else if (a<c && c<b) {
            System.out.printf("Số nhỏ nhất: %d \nSố lớn nhì: %d \nSố lớn nhất: %d ",a,c,b);
        }else if (b<a && a<c) {
            System.out.printf("Số nhỏ nhất: %d \n Số lớn nhì: %d \n Số lớn nhất: %d ",b,a,c);
        }else if (b<c && c<a) {
            System.out.printf("Số nhỏ nhất: %d \n Số lớn nhì: %d \n Số lớn nhất: %d ",b,c,a);
        }else if (c<a && c<b) {
            System.out.printf("Số nhỏ nhất: %d \n Số lớn nhì: %d \n Số lớn nhất: %d ",c,a,b);
        }else {
            System.out.printf("Số nhỏ nhất: %d \n Số lớn nhì: %d \n Số lớn nhất: %d ",c,b,a);
        }
    }
}
