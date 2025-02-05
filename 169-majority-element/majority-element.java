class Solution {
    public int majorityElement(int[] nums) {
        int canadite = nums[0];
        int count = 1;


        for(int i = 0; i < nums.length - 1; i++){
            if(count == 0){
                canadite = nums[i + 1];
            }

            if(nums[i + 1] == canadite){
                count++;
            }

            else{
                count--;
            }
        }

        return canadite;
    }
}