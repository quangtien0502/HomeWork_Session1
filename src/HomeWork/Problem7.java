package HomeWork;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi vầ diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi vầ diện tích hình tròn");
            System.out.println("3. Tính chu vi và diện tích hình tam giác ");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Chiều dài của hình chữ nhật: ");
                    double lenght = scanner.nextDouble();
                    System.out.println("Chiều rộng của hình chữ nhật là");
                    double width = scanner.nextDouble();

                    System.out.printf("Hình chữ nhật có chu vi là %.2f%n và diện tích là %.2f%n" ,2*(lenght+width),lenght*width);

                    break;
                case 2:
                    System.out.println("Bán kính của hình tròn là");
                    double radius = scanner.nextDouble();
                    System.out.printf("Hình tròn có chu vi là %.2f%n và diện tích là %.2f%n" ,2*3.14*radius,radius*radius*3.14);

                    break;
                case 3:
                    System.out.println("Cạnh  thứ nhất của tam giác là");
                    double a = scanner.nextDouble();

                    System.out.println("Cạnh  thứ hai của tam giác là");
                    double b = scanner.nextDouble();

                    System.out.println("Cạnh  thứ ba của tam giác là");
                    double c = scanner.nextDouble();

                    double s = (a + b + c) / 2;
                    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                    System.out.printf("Hình tam giác có chu vi là %.2f%n và diện tích là %.2f%n" ,a+b+c,area);

                    break;
                case 4:
                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Hãy chọn các lựa chọn từ 1 tới 4");
            }
        }
    }
}
