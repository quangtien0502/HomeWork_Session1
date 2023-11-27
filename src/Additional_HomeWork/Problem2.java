package Additional_HomeWork;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập điểm HTML của bạn:");
        int html = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập điểm css của bạn:");
        int css = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập điểm javascript của bạn:");
        int javascript= Integer.parseInt(scanner.nextLine());
        float average = (html+css+javascript)/3;
        String ranked = "";
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
