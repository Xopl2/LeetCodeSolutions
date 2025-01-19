class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int total = 0;

        for(int i = 0; i < length; i++){
            int current = 0;
            int next = 0;

            switch(s.charAt(i)){
                case 'M' : current = 1000;
                    break;
                case 'D' : current = 500;
                    break;
                case 'C' : current = 100;
                    break;
                case 'L' : current = 50;
                    break;
                case 'X' : current = 10;
                    break;
                case 'V' : current = 5;
                    break;
                case 'I' : current = 1;
                    break;
                default : current = 0;
            }

            if(i < length - 1){
                switch(s.charAt(i + 1)){
                case 'M' : next = 1000;
                    break;
                case 'D' : next = 500;
                    break;
                case 'C' : next = 100;
                    break;
                case 'L' : next = 50;
                    break;
                case 'X' : next = 10;
                    break;
                case 'V' : next = 5;
                    break;
                case 'I' : next = 1;
                    break;
                default : next = 0;
            }
            }

            if(current < next){
                total -= current;
            }

            else{
                total += current;
            }
        }

        return total;
    }
}