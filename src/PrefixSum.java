public class PrefixSum {

    public static int[] buildPrefix(int[] arr){

        int[] prefix = new int[arr.length + 1];

        // 1 based indexing
        for(int i=1; i<=arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i-1];
        }
        return prefix;
    }
    public static int rangeSum(int[] prefix, int l, int r){
        return prefix[r] - prefix[l-1];
    }

    // zero based indexing
    public static int[] buildPrefix2(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];

        }

        return prefix;
    }


    // find sum
    public static int findSumRange(int[] prefix, int l, int r){

        if(l == 0){
            return prefix[r];
        } else {
            return prefix[r] - prefix[l - 1];

        }
    }


    public static void main(String[] args){

        int[] arr = {2,4,5,6,7,8};

        int[] prefix = buildPrefix(arr);

        for(int i=0; i<prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }
        System.out.println();

        int sum = rangeSum(prefix, 1, 4);
        System.out.println(sum);


        int prefix2[] = buildPrefix2(arr);

        int sum2 = findSumRange(prefix2, 1,4);
        System.out.println(sum2);
    }
}
