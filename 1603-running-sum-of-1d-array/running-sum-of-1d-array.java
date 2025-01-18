class Solution {
    public int[] runningSum(int[] nums) {
        //variable definitions
        int[] runningSum = new int[nums.length];
        int Sum = 0;

        //running sum loop
        for(int i = 0; i < nums.length; i++){
            
            Sum += nums[i];
            runningSum[i] = Sum;
        }

        return runningSum;
    }
}