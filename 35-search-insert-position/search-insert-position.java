class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > target){
                return i;
            }
            count++;
        }

        return count;
        
    }
}