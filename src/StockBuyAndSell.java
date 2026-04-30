public class StockBuyAndSell {

    public static int maxProfit(int[] arr){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,4,6,10,11};
        int res = maxProfit(arr);
        System.out.println(res);
    }
}
