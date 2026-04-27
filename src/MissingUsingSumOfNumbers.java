public class MissingUsingSumOfNumbers {

    public static int findMissing(int[] arr, int n){
        int sumofN = 0;
        for(int i=1; i<=n+1; i++){
            sumofN = sumofN + i;
        }

        for(int i=0; i<n; i++){
            sumofN = sumofN - arr[i];
        }

        return sumofN;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5,6};
        int n = arr.length;

        int missingNumber = findMissing(arr,n);
        System.out.println(missingNumber);
    }
}
