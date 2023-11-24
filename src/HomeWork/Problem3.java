package HomeWork;

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

                return true;

            }
        }
        return false;

    }

    public static void main(String[] args) {
        boolean isPrime = checkPrimeNumber(6);
        System.out.println("Co phai so nguyen to hay khong ?"+ isPrime);

    }
}
