package Additional_HomeWork;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so cua ban vao");
        int number = scanner.nextInt();
        while (true){


            System.out.println("Menu:");
            System.out.println("1. In day so chia het cho 2 va giam dan");
            System.out.println("2. In cac so nho hon n va tinh tong");
            System.out.println("3. In cac so uoc chan cua n");
            System.out.println("4. In cac so uoc le va so luong uoc le cua n");
            System.out.println("5. In ra uoc le lon nhat cua n");
            System.out.println("6. Thoat");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i =number;i>0;i--){
                        if(i%2==0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 2:
                    int sum=0;
                    for(int i=number-1;i>0;i--){
                        sum+=i;
                        System.out.println(i);
                    }
                    System.out.println("Tong cua cac so nho hon n la "+sum);
                    break;
                case 3:
                    for(int i=0;i<=number;i++){
                        if(number%i==0 && i%2==0){
                            System.out.println(i);
                        }
                    }
                    break;
                case 4:
                    int count =0;
                    for(int i=0;i<=number;i++){
                        if(number%i==0 && i%2==1){
                            count++;
                            System.out.println(i);
                        }
                    }
                    break;
                case 5:
                    for(int i=number;i>0;i--){
                        if(number%i==0 && i%2==1){

                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Hay nhap lua chon tu 1-6");
            }
        }
    }
}
