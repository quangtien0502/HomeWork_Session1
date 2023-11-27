package Additional_HomeWork;

import java.util.Scanner;

public class Problem6 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Hãy nhập số thứ hai");
        int num2= scanner.nextInt();

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Tổng 2 số "+(num1+num2));
                    break;
                case 2:
                    if (num1 > num2) {
                        System.out.printf("Hiệu của hai số là %d", num1 - num2);
                    } else {
                        System.out.printf("Hiệu của hai số là %d", num2 - num1);
                    }
                    break;
                case 3:
                    System.out.println("Tích của 2 số là: "+ num1*num2);
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("Không thể chia cho 0");
                    }else {
                        double divided = num1/num2;
                        System.out.println("Thương của 2 số là "+divided);
                    }
                    break;
                case 5:
                    System.out.println("Sơ dư "+num1%num2);
                    break;
                case 6:
                    int GMD = 1;
                    for(int i=1;i<=num2;i++){
                        if(num1%i==0 && num2%i==0){
                            GMD = i;
                        }
                    }
                    System.out.println("UCLN là "+GMD);
                    break;
                case 7:
                    int LCM = 1;
                    while (LCM%num2!=0&&LCM%num1!=0){
                        LCM++;
                    }
                    System.out.println("BCNN la "+LCM);
                    break;
                case 8:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn số từ 1-8");
                    break;
            }
        }

    }
}
