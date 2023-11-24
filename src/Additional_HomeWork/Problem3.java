package Additional_HomeWork;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập bán kính của hình tròn");
        float radius = scanner.nextFloat();
        final float Pi = (float) 3.14;
        float perimeter = 2*radius*Pi;
        float area = radius*radius*Pi;
        System.out.printf("Hình tròn có chu vi là %f và có diện tích là %f",perimeter,area);
    }
}
