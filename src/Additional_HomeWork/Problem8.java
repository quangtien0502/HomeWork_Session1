package Additional_HomeWork;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();


        System.out.println("Nhập tháng ");
        int month = scanner.nextInt();

        System.out.println("Nhập ngày");
        int day = scanner.nextInt();


        if(month > 12 || month < 1 || day < 1 || day > 31){
            System.out.println("Ngày nhập của bạn không hợp lệ");
        }else {
            if (month == 4 || month == 6 || month == 9 ||month == 11){
                if (day>30){
                    System.out.println("Ngày bạn nhập không hợp lệ");
                }
                else {
                    System.out.println("Ngày bạn nhập hơp lệ");
                }
            } else if (month==2) {
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if(day>29){
                        System.out.println("Ngày bạn nhập không hợp lệ");
                    }
                    else{
                        System.out.println("Ngày bạn nhập hợp lệ");
                    }
                }else {
                    if(day>28){
                        System.out.println("Ngày bạn nhập không hợp lệ");
                    }
                    else {
                        System.out.println("Ngày bạn nhập hợp lệ");

                    }
                }
            }else {
                System.out.println("Ngày bạn nhập hợp lệ");
            }

        }

    }

}
