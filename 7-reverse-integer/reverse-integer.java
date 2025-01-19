class Solution {
    public int reverse(int x) {
        int reversed = 0;

        boolean isNegative = x < 0;
        if(isNegative){
            if(x == Integer.MIN_VALUE){
                return 0;
            }
            x = -x;
        }

        while(x != 0){
            int digit = x % 10;
            x = x / 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }

            reversed = reversed * 10 + digit;
        }

        if (isNegative) {
            return -reversed;
        } else {
            return reversed;
        }
    }
}