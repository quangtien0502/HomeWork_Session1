package HomeWork;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập điểm toán của bạn");
        float math = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm lý của bạn");
        float physics = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm hóa của bạn");
        float chemistry = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm tiếng anh của bạn");
        float english = Float.parseFloat(scanner.nextLine());
        System.out.println("Hãy nhập điểm văn của bạn");
        float literature = Float.parseFloat(scanner.nextLine());
        String ranked="";
        float average = (math+physics+chemistry+english+literature)/5;
        if(average>=0 && average <5){
            ranked = "Yếu";
        } else if (average>=5 && average <6.5) {
            ranked = "Trung Bình";
        }
        else if (average>=6.5 && average <8) {
            ranked = "Khá";
        }
        else if (average>=8 && average <9) {
            ranked = "Giỏi";
        }
        else if (average>=9) {
            ranked = "Xuất sắc";
        }
        System.out.printf("Điểm trung bình của bạn là %f và học lực của bạn là %s",average,ranked);
    }
}
