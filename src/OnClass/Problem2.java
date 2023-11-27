package OnClass;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập tuổi của bạn");
        int age = scanner.nextInt();
        int discountPercent;
        if(age<6 || age >60){
            discountPercent = 100;
        } else if (age < 18) {
            discountPercent=50;
        } else {
            discountPercent=0;
        }
        System.out.printf("Số tiền người đó phải trả cho vé xe buýt là: %d VNĐ",70*(100-discountPercent));
    }
}
