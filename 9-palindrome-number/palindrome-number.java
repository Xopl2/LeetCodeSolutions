class Solution {
    public boolean isPalindrome(int x) {
    int reverse = 0;
    int temp = x;

        //veto any and all negative numbers
        if(x < 0){
            return false;
        }

       //reversing the number
       while(temp > 0){
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
       }

       //checking if palindrome
       if(reverse == x){
            return true;
       }

       
        return false;
    }
}