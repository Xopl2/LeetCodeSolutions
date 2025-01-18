class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        int runningSum = 0;

        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                runningSum += accounts[i][j];
            }
            if(runningSum > richest){
                richest = runningSum;
            }
            runningSum = 0;
        }

        return richest;
    }
}