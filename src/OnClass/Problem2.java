package OnClass;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        * 1. Nhap so phan tu mang
        * 2. khai bao mang so nguyen 1 chieu gom n phan tu
        * 3. In Menu va thuc hien cac chuc nang theo menu:
        *
        *  ********************MENU*******************
        *  1.Nhap gia tri cac phan tu mang
        *  2.In gia tri cac phan tu mang
        * 3. In gia tri cac phan tu co gia tri chan va tinh tong
        * 4.In gia tri cac phan tu co chi so le va tinh tong
        * 5.In gia tri cac phan tu la so nguyen to
        * 6. Sap xep mang tang dan
        * 7. Nhap 1 so va thong ke so do xuat hien bao nhieu lan trong mang
        * 8. Thoat
        * */

        System.out.println("Please enter the length of array: ");
        int arrLength = scanner.nextInt();
        int[] myNumber =new int[arrLength];

        while (true){

            System.out.println("Menu:");
            System.out.println("1. All values of array");
            System.out.println("2. Print all values of array");
            System.out.println("3. Print all even values of array and calculate sum of it");
            System.out.println("4. Print all odd values of array and calculate sum of it");
            System.out.println("5. Print all the values which are the prime numbers");
            System.out.println("6. Sort the array with ascending order");
            System.out.println("7. Enter a number and count how many times it appear in the array");
            System.out.println("8. Exit");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i=0;i<arrLength;i++){
                        System.out.printf("The value of array at index %d is:",i);
                        myNumber[i]=scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Printing all the values of the array");
                    for (int value:myNumber
                         ) {
                        System.out.println(value);
                    }
                    break;
                case 3:
                    int sumEven=0;
                    System.out.println("All the Even numbers in array are: ");
                    for (int value:myNumber
                         ) {
                        if(value%2==0){
                            sumEven=value;
                            System.out.println(value);
                        }
                    }
                    System.out.println("The sum of all even values in arary are "+sumEven);
                    break;
                case 4:
                    int sumOdd=0;
                    System.out.println("All the Odd numbers in array are: ");
                    for (int value:myNumber
                    ) {
                        if(value%2==1){
                            sumOdd+=value;
                            System.out.println(value);
                        }
                    }
                    System.out.println("The sum of all Odd values in arary are "+sumOdd);
                    break;
                case 5:
                    for (int value: myNumber
                         ) {
                        for (int i=2;i<value;i++){
                            if(value%i==0){
                                break;
                            } else if (i==value-1) {
                                System.out.printf("%d is the prime number \n",value);
                            }
                        }
                    }
                    break;
                case 6:
                    Arrays.sort(myNumber);
                    for (int value: myNumber){
                        System.out.println(value);
                    }
                    break;
                case 7:
                    System.out.println("Please enter a number that you need for statistic");
                    int testNumber = scanner.nextInt();
                    int count = 0;

                    for (int value: myNumber
                         ) {
                        if(value==testNumber){
                            count++;
                        }
                    }
                    System.out.printf("This number appear %d times in the array ",count);
                    break;
                case 8:
                    System.out.println("Leaving");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please enter value from 1-8");
            }
        }
    }
}
