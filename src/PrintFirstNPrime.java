import java.util.Scanner;

public class PrintFirstNPrime {

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }

        for(int i=2; i <= num / 2; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int num = 2;

        while(count < n){
            if(isPrime(num)){
                System.out.print(num + " ");
                count ++;
            }
            num++;
        }
    }
}
