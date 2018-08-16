class Solution {
    public String commonPrefixTwoArrays(String s1, String s2) {
        String res = "";
        int i = 0, j =0;
        
        while (i < s1.length() && j < s2.length()) {
           if (s1.charAt(i) == s2.charAt(j)){
            res += "" + s1.charAt(i);
            i++;
            j++;
           }
           else 
            break;
        }
        return res;           
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String res = commonPrefixTwoArrays(strs[0], strs[1]);
        
        for (int i = 2; i < strs.length; i++)
            res = commonPrefixTwoArrays(res, strs[i]);
        
        return res; 
    }
}
