package Additional_HomeWork;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào ngày công thực tế");
        int dayWork = scanner.nextInt();
        System.out.println("Lương cơ bản của nhân viên là: ");
        int basicSalary = scanner.nextInt();
        double salary = 0;
        if(dayWork<=26){
            salary = dayWork*basicSalary;
        }else {
            salary= (dayWork-26)*1.5*basicSalary + basicSalary*26;
        }

        System.out.println("Lương thực tế của nhân viên là: "+salary);
    }
}
