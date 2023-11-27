package OnClass;

import java.util.Scanner;

public class Problem3 {

    public static boolean checkPrimeNumber(int x) {
        if(x<1){
            return false;
        } else if (x==2) {
            return true;
        } else if (x>2) {
            for(int i=2;i<x;i++){
                if(x%i==0){
                    return false;

                }



            }
            return true;
        }
        return false;

    }

    public static boolean checkPerfectNumber(int x){

        int sum = 0;

        for(int i =1;i<x;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }

        if(sum==x){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. Nhập vào một số n");
            System.out.println("2. In ra các số chẵn từ 1-n và tính tổng");
            System.out.println("3. Kiểm tra n có phải số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải số hoàn hảo không");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn là: ");


            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Số mà bạn cần nhập là: ");
                    number=scanner.nextInt();
                    break;
                case 2:
                    for(int i =1;i<=number;i++){
                        if(i%2==0){
                            System.out.println(i);
                            sum=sum+i;
                        }
                    }
                    System.out.printf("Tổng của các số chẵn từ 1 đến %d là %d \n",number,sum);
                    break;
                case 3:
                    if(checkPrimeNumber(number)){
                        System.out.println("Đây là số nguyên tố");
                    }else {
                        System.out.println("Đây không phải là số nguyên tố");
                    }

                    break;
                case 4:
                    if(checkPerfectNumber(number)){
                        System.out.println("Đây là số hoàn hảo");
                    }else {
                        System.out.println("Đây không phải là số hoàn hảo");
                    }

                    break;
                case 5:

                    System.out.println("Đang thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn số từ 1-5");
            }
        }
    }
}
