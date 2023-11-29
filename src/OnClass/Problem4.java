package OnClass;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        /*
         * 1.Nhap vao so dong va so cot cua mang 2 chieu
         * 2. Khai bao mang hai chieu
         * 3. In Menu
         *
         * Menu
         * 1. Nhap gia tri cac phan tu mang
         * 2. In gia tri cac phan tu mang theo ma tran
         * 3.In cac gia tri cac phan tu tren duong bien va tinh tong
         * 4. In gia tri cac phan tu tren duong cheo chih, cheo phu va tinh tong
         * 5.tim gia tri lon nhat va nho nhat
         * 6. Sap xep mang giam dan theo cot
         * 7. Thong ke cac phan tu co gia tri le chia het cho 3
         * 8.Thoat
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int row = scanner.nextInt();
        System.out.println("Please enter number of columns");
        int col = scanner.nextInt();

        int[][] myArr = new int[row][col];

        while (true){
            System.out.println("Menu");
            System.out.println("1.Enter elements value");
            System.out.println("2. Print the value of all elements in matrix form");
            System.out.println("3. Print the value of all elements in boundary in matrix");
            System.out.println("4.Print the value of all elements in main diagonal and sub-diagonal in matrix");
            System.out.println("5.Find the biggest and the smallest value in matrix");
            System.out.println("6.Sort in descending order through columns");
            System.out.println("7.List all odd elements and divided for 3");
            System.out.println("8.Exit");
            System.out.println("Please enter your choice");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    for (int i=0;i<row;i++){
                        for (int j=0;j<col;j++){
                            System.out.printf("Elements at myArr[%d][%d] is: ",i,j);
                            myArr[i][j]=scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i=0;i<row;i++){
                        for (int j=0;j<col;j++){
                            System.out.print(myArr[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum=0;
                    System.out.println("All the value at the boundary is ");
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(i==0 || j==0 || i==row-1 || j==col-1){
                                System.out.println(myArr[i][j]);
                                sum+=myArr[i][j];
                            }
                        }
                    }
                    System.out.println("Sum of all elements at boundary is "+sum);
                    break;
                case 4:
                    if(row!=col){
                        System.out.println("Please enter again the row and column to make this matrix become square matrix");
                        System.out.println("Row");
                        row=scanner.nextInt();
                        System.out.println("Column");
                        col=scanner.nextInt();
                    }else {
                        int sumMainDiagonal=0;
                        int sumSubDiagonal=0;
                        System.out.println("all elements on main diagonal");
                        for (int i=0;i<row;i++){
                            for (int j=0;j<col;j++){
                                if(i==j){
                                    System.out.println(myArr[i][j]);
                                    sumMainDiagonal+=myArr[i][j];
                                }
                            }
                        }
                        System.out.printf("Sum of all elements in Main Diagonal is %d",sumSubDiagonal);
                        System.out.println("All elements on Sub Diagonal is");
                        for (int i=0;i<row;i++){
                            for (int j=0;j<col;j++){
                                if(i+j==row-1){
                                    System.out.println(myArr[i][j]);
                                    sumSubDiagonal+=myArr[i][j];
                                }
                            }
                        }
                        System.out.printf("Sum of all elements in Main Diagonal is %d",sumSubDiagonal);
                    }
                    break;
                case 5:
                    int max=0;
                    int min=0;
                    for(int i=0;i<row;i++){
                        for (int j=0;j<col;j++){
                            if(myArr[i][j]>max){
                                max=myArr[i][j];
                            }
                            if(myArr[i][j]<min){
                                min=myArr[i][j];
                            }
                        }
                    }
                    System.out.printf("Max and min elements are %d and %d",max,min);
                    break;
                case 6:
                    for (int j=0;j<col;j++){
                        for (int i=0;i<row-1;i++){
                            for(int k=i+1;k<row;k++){
                                if(myArr[i][j]<myArr[k][j]){
                                    int temp=myArr[i][j];
                                    myArr[i][j]=myArr[k][j];
                                    myArr[k][j]=temp;
                                }
                            }
                        }
                    }

                    break;
                case 7:
                    System.out.println("All odd elements divided by 3 are");
                    for (int i=0;i<row;i++){
                        for (int j=0;j<col;j++){
                            if(myArr[i][j]%3==0 && myArr[i][j]%2!=0){
                                System.out.println(myArr[i][j]);
                            }
                        }
                    }
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
