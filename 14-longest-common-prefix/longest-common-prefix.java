class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        String prefix = strs[0];

        if(strs.length == 0 || strs[0].length() == 0){
            return "";
        }

        for(int i = 1; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }
}