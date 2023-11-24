package Additional_HomeWork;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào năm sinh của bạn");
        int yearBirth= scanner.nextInt();
        int age = 2023-yearBirth;
        String isEven = "";
        if(age%2==0){
            isEven="Chẵn";
        }else{
            isEven="Lẻ";
        }
        System.out.printf("Bạn %d tuổi và tuổi của bạn là số %s",age,isEven);
    }
}
