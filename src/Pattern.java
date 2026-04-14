import java.util.Scanner;

public class Pattern {

    public static void pattern1(){
        System.out.println("Pattern1");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void pattern2(){
        System.out.println("Pattern 2");
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void pattern3(){
        System.out.println("Pattern 3");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }


    public static void pattern4(){
        System.out.println("Pattern 4");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }

            System.out.println();
        }
    }

    public static void pattern5(){
        System.out.println("Pattern 5");
        for(int i=1; i<=5; i++){
            for(int j=i; j<=5; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern6(){

        System.out.println("Pattern 6");
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void pattern7(int n){

        System.out.println("Pattern 7");

        for(int i=0; i<n; i++){
            // spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            // stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            // spaces
            for(int j=0; j<n-i-1; j++){

                System.out.print(" ");
            }

            System.out.println();
        }

    }


    public static void pattern8(int n){
        System.out.println("Pattern 8");
        for(int i=n-1; i>=0; i--){
            // space
            for(int j=1; j<=n-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<= 2 * i + 1; j++)
            {
                System.out.print("*");

            }
            //space
            for(int j=1; j<=n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public static void pattern9(int n){

        System.out.println("Pattern 10");

        for(int i=0; i<=2*n-1; i++){

            int stars = i;

            if(i > n){
                stars = 2 * n - i;
            }
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }


    public static void pattern10(int n){
        System.out.println("Pattern 10");
        int start = 1;
        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                start = 1;
            } else {
                start = 0;
            }

            for(int j = 0; j<=i; j++){
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);

    }
}
