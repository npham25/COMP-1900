class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        
       int i = s.length() - 1;
        
        while(i >= 0 && s.charAt(i) == ' ') {
            i --;
        }
        
        if (i == -1)
            return 0;
        else if (i == 0)
            return 1;
        else {
            int j = i - 1;
            while(j >= 0 && s.charAt(j) != ' ')
                j --;
            return i - j;
        }
    }
}
