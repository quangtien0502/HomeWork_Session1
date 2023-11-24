package Additional_HomeWork;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập chiều dài hình chữ nhật: ");
        float length = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập chiều rộng hình chữ nhật: ");
        float width = Float.parseFloat(scanner.nextLine());
        float perimeter = 2*(length + width);
        float area = length*width;
        System.out.printf("Hình chữ nhật có chu vi %f và diện tích %f",perimeter,area);
    }
}
