package Additional_HomeWork;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your row: ");
        int row = scanner.nextInt();
        System.out.println("Please enter your row: ");
        int col = scanner.nextInt();

        int[][] myArr = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.printf("Element at position myArr[%d][%d] ",i,j);
                myArr[i][j]=scanner.nextInt();
            }

        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(myArr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
