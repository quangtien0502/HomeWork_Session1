package Additional_HomeWork;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your array length");
        int arrLength = scanner.nextInt();
        int[] myArray= new int[arrLength];

        for(int i=0;i<arrLength;i++){
            System.out.printf("The index %d has value: ",i+1);
            myArray[i]=scanner.nextInt();
        }
        int min=myArray[0],max=myArray[arrLength-1];
        for (int value:myArray
        ) {
            if(min>value){
                min=value;
            }
            if(max<value){
                max=value;
            }
        }
        System.out.printf("Min is %d and max is %d",min,max);
    }
}
