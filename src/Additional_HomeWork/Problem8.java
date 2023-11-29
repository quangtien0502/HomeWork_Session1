package Additional_HomeWork;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The array length is ");
        int arrLength = scanner.nextInt();
        int updateValue, updateIndex;
        int[] myArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Elements value at position %d is", i);
            myArr[i] = scanner.nextInt();
        }
        System.out.println("Please enter the Number that you need to update");
        updateValue = scanner.nextInt();
        System.out.println("Please enter the index that number is updated");
        do {
            updateIndex = scanner.nextInt();
        } while (updateIndex >= arrLength);
        myArr[updateIndex] = updateValue;
        for (int value : myArr
        ) {
            System.out.println(value);
        }
    }
}
