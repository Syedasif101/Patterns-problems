public class SecondLargest {

    public static int[] largestAndSecondLargest(int[] arr){


        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args){
        int[] arr = {12,2,7,9,10,3};
        int[] result = largestAndSecondLargest(arr);
        System.out.println("Largest: " + result[0]);
        System.out.println("Second Largest: " + result[1]);


    }
}
