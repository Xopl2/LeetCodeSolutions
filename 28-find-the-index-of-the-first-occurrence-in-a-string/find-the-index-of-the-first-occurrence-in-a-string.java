class Solution {
    public int strStr(String haystack, String needle) {
        
        if(!haystack.contains(needle)){
            return -1;
        }

        int startIndex = haystack.indexOf(needle);

        return startIndex;
        
    }
}