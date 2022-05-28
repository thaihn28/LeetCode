package LeetCode;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        MaxSubArray m = new MaxSubArray();
        System.out.println(m.maxSubarray(arr));
    }

//    Kaden's Algorithm

    public int maxSubarray(int[] inputArray) {
        int currentSum = 0;
        int maxSum = 0;
        for(int i = 0; i < inputArray.length; i++){
            currentSum = currentSum + inputArray[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
