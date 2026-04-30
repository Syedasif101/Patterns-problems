import java.util.Scanner;

public class IsPrime {

    public static boolean checkIsPrime(int x){


        if(x == 2){
            return true;
        }

        for(int i=2; i<x/2; i++){
            if(x % i == 0){
                return false;
            }

        }

        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        boolean isPrime = checkIsPrime(x);
        System.out.println(isPrime);
    }
}
