package Additional_HomeWork;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The array length is ");
        int arrLength= scanner.nextInt();
        int[] myArr= new int[arrLength];
        int[] myNewArr;
        int addNumber,addIndex;
        for (int i=0;i<arrLength;i++){
            System.out.printf("Elements value at position %d is",i);
            myArr[i]=scanner.nextInt();
        }
        System.out.println("Please enter the Number that you need to add");
        addNumber=scanner.nextInt();
        System.out.println("Please enter the index that number is added in");
        addIndex=scanner.nextInt();
        if(addIndex<arrLength){
            myNewArr = new int[arrLength+1];
            for(int i=0;i<arrLength+1;i++){
                if(i<addIndex){
                    myNewArr[i]=myArr[i];
                } else if (i==addIndex) {
                    myNewArr[i]=addNumber;
                }else {
                    myNewArr[i]=myArr[i-1];
                }
            }
        }else {
            myNewArr= new int[addIndex+1];
            for (int i=0;i<arrLength+1;i++){
                if(i<arrLength){
                    myNewArr[i]=myArr[i];
                }else {
                    myNewArr[addIndex]=addNumber;
                }
            }
        }
        for (int value:myNewArr
             ) {
            System.out.println(value);
        }

    }
}
