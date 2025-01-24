class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }     

        long z = x;
        while(z * z > x){
            z = (z + x / z) / 2;
        }
        return (int)z;
    }
}