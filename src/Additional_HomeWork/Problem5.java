package Additional_HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập điểm toán của bạn: ");
        int math = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập điểm văn của bạn: ");
        int literature = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập điểm anh của bạn: ");
        int engilsh = Integer.parseInt(scanner.nextLine());

        double average = (math+engilsh+literature)/3;
        System.out.printf("Điểm trung bình 3 môn của bạn là %.2f",average);

    }
}
