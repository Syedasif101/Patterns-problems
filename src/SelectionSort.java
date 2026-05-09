class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++) {
            int min_index = 0;
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;

                }
            }
            temp[i] = arr[min_index];
            arr[min_index] = Integer.MAX_VALUE;

        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }

        return arr;


    }


    public static void main(String[] args){
        int[] arr = {2,5,8,10,18,20};

        int[] newArr = selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}