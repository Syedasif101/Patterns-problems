public class SelectionSortOptimal {

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++) {
            int min_index = i;
            for (int j=i+1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr = {10,5,8,20,2,18};

        int[] newArr = selectionSort(arr);

        for(int i=0; i<newArr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
