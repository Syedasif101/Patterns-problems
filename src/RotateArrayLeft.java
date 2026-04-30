public class RotateArrayLeft {
    public static void main(String[] args ){
        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        int n = arr.length;
        for(int i=0; i<d; i++){
            int temp = arr[0];
            for(int j = 0; j < n-1; j++){
                arr[j] = arr[j+1];
            }

            arr[n-1] = temp;
        }


        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
