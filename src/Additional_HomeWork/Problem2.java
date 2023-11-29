package Additional_HomeWork;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.println("Please enter your array length");
        int arrLength = scanner.nextInt();
        int[] myArray= new int[arrLength];
        double average = 0;
        for(int i=0;i<arrLength;i++){
            System.out.printf("The index %d has value: ",i+1);
            myArray[i]=scanner.nextInt();
        }

        for (int value:myArray
             ) {
            sum+=value;
        }
        average = sum/arrLength;
        System.out.printf("Average of all values in array is: %,.2f",average);
    }
}
