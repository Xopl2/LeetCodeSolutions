class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         HashMap<Character, Integer> magazineCount = new HashMap<>();

        //counts the amount of each character in magazine and stores this info in the hashmap "magazineCount"
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++){
            //makes char the letter we are currently checking
            char c = ransomNote.charAt(i);

            if(magazineCount.containsKey(c) && magazineCount.get(c) > 0){
                magazineCount.put(c, magazineCount.get(c) - 1);
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}