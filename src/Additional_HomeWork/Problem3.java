package Additional_HomeWork;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Phở tôm hùm");
        System.out.println("2. Phở bò Kobe");
        System.out.println("3. Phở gà Việt Nam");
        System.out.println("4. Xôi trứng thịt");
        System.out.println("5. Bánh mỳ trứng");
        System.out.println("6. Mỳ tôm không người lái");
        System.out.println("7. Thoát");
        System.out.print("Lựa chọn của bạn là: ");
        int choice = scanner.nextInt();
        while (true) {

            switch (choice){
                case 1:
                    System.out.println("Bạn vừa chọn món Phở tôm hùm,Vui lòng đợi trong giây lát");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn món Phở bò Kobe,Vui lòng đợi trong giây lát");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn món Phở gà Việt Nam,Vui lòng đợi trong giây lát");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn món Xôi trứng thịt,Vui lòng đợi trong giây lát");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn món Bánh mỳ trứng,Vui lòng đợi trong giây lát");
                    break;
                case 6:
                    System.out.println("Bạn vừa chọn món Mỳ tôm không người lái,Vui lòng đợi trong giây lát");
                    break;
                case 7:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-7");
            }
        }
    }
}
