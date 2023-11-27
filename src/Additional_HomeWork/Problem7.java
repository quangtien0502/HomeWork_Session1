package Additional_HomeWork;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int num1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai");
        int num2 = scanner.nextInt();
        System.out.println("Nhập số thứ ba");
        int num3 = scanner.nextInt();
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tổng của ba số nguyên");
            System.out.println("2. Trung bình cộng của ba số nguyên");
            System.out.println("3. Số lớn nhất, nhỏ nhất");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Tong cua 3 so nguyen nay la "+num1+num2+num3);
                    break;
                case 2:
                    System.out.printf("trung binh cong cua 3 so nguyen %,.3f",(num1+num2+num3)/3);
                    break;
                case 3:
                    int min = num1;
                    int max = num3;
                    if(min>num2){
                        min=num2;
                        if(min>num3){
                            min=num3;
                        }
                    }
                    if(max<num2){
                        max=num2;
                        if(max<num1){
                            max=num1;
                        }
                    }

                    System.out.printf("So nho nhat la %d va so lon nhat la %d ",min,max);
                    break;
                case 4:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hay nhap so trong khoang tu 1-4");
            }
        }

    }
}
