class Solution {
    public int lengthOfLastWord(String s) {
        //trimming spaces off the end of the string
        s = s.trim();

        //checking for the index of the last occurince of a space
        int lastSpace = s.lastIndexOf(" ");

        //returning the length of the last word 
        return s.length() - lastSpace - 1;
    }
}