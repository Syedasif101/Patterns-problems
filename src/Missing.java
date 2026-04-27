public class Missing {

    public static int findMissing(int[] arr, int n){

        // Brute force approach

        for(int i=1; i<=n; i++){

            int flag = 0;

            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;

                }
            }

            if(flag == 0){
                return i;

            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,7,8,10};
        int n = arr.length;

        int missing = findMissing(arr,n);
        System.out.println(missing);

    }
}
