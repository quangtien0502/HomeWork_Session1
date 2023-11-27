package HomeWork;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Hãy nhập ba cạnh của tam giaác");
            System.out.println("Cạnh thứ nhất của tam giác ");
            double a = scanner.nextDouble();
            System.out.println("Cạnh thứ hai của tam giác ");
            double b = scanner.nextDouble();
            System.out.println("Cạnh thứ ba của tam giác ");
            double c = scanner.nextDouble();

            if(a+b <=c || a+c <=b || b+c <=a){
                System.out.println("Đây không phải ba cạnh của tam giác");
            }else {
                System.out.println("Đây là ba cạnh của tam giác");
            }
        }
    }
}
