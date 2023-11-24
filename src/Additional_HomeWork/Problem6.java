package Additional_HomeWork;

import java.util.Scanner;

public class Problem6 {

   static int smallestNumber(int x,int y, int z){
        if(x-y<=0 && x-z <=0){
            return x;
        } else if (y-z<=0 && y-z<=0) {
            return y;
        } else if (z-x <=0 && z-y <=0) {
            return z;
        }
        return 0;
    }
    static int biggestNumber(int x,int y, int z){
        if(x-y>=0 && x-z >=0){
            return x;
        } else if (y-z>=0 && y-z>=0) {
            return y;
        } else if (z-x >=0 && z-y >=0) {
            return z;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số thứ nhất");
        int x= Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số thứ hai");
        int y= Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số thứ ba");
        int z= Integer.parseInt(scanner.nextLine());

        int smallest = smallestNumber(x,y,z);
        int biggest = biggestNumber(x,y,z);
        System.out.printf("Số nhỏ nhất là %d và số lớn nhất là %d",smallest,biggest);
    }
}
