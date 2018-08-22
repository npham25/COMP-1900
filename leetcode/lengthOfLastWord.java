class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        
        int spaceIndex = 0;
        int spaceCount = 0;
        
    //Find the index of the lase space
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                spaceIndex = i;
                spaceCount += 1; // count to see whether String has only one word
            }
        }
        
    //in case only one word in String, no ' '
        if(spaceIndex == 0 && spaceCount == 0)
            return s.length();
        
    //in case String includes spaces only
        if(s.length() == spaceCount)
            return 0;
        
    //in case after the last word is/are one/multiple space(s) ' '
        if (s.length() == (spaceIndex + 1)) {
    //reduce index to the first space(the one closest to to last word)
            while(s.charAt(spaceIndex - 1) == ' ') { 
                    spaceIndex -= 1;       
            }
    // find the length of the last word
            for (int i = (spaceIndex - 1); i >= 0; i--) {
                if (i == 0 && s.charAt(i) != ' ')
                    return spaceIndex;
                if (s.charAt(i) == ' ')
                    return spaceIndex - 1 - i;
            }
        }
        
    //normal case result
        return s.length() - (spaceIndex + 1);
    }
}
