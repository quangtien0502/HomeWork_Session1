package Additional_HomeWork;

import java.util.Scanner;

public class Problem6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The array length is ");
        int arrLength= scanner.nextInt();
        int[] myArr= new int[arrLength];
        int findNumber;
        for (int i=0;i<arrLength;i++){
            System.out.printf("Elements value at position %d is",i);
            myArr[i]=scanner.nextInt();
        }
        System.out.println("Please enter the number you need to find in array");
        findNumber=scanner.nextInt();
        int sum=0;
        for (int i=0;i<arrLength;i++){
            if(myArr[i]==findNumber){
                System.out.printf("elements at index %d have value equals %d",i,findNumber);
                sum+=findNumber;
            }
        }
        System.out.printf("Sum of all elements that have value equal %d is %d",findNumber,sum);
    }
}
