public class JugglingAlgorithm {

    public static int findGCD(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }

    public static void rotate(int[] arr, int d){
        int n = arr.length;

        // handle case where d > n
        d = d % n;
        int cycles = findGCD(n, d);

        for(int i=0; i < cycles; i++){
            int startEle = arr[i];
            int currIndex = i, nextInx;

            while(true){
                nextInx = (currIndex + d) % n;

                if(nextInx == i){
                    break;
                }

                arr[currIndex] = arr[nextInx];
                currIndex = nextInx;
            }

            arr[currIndex] = startEle;

        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        rotate(arr, d);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    }

