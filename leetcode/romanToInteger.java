class Solution {
    public int valueChar(char c) {
        if (c == 'I')
            return 1;
        if (c == 'V')
            return 5;
        if (c == 'X')
            return 10;
        if (c == 'L')
            return 50;
        if (c == 'C')
            return 100;
        if (c == 'D')
            return 500;
        if (c == 'M')
            return 1000;
        return -1;
            
    }
    public int romanToInt(String s) {
        int n1 = 0, n2 = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            n1 = valueChar(s.charAt(i));
            if (i + 1 < s.length()) {
                n2 = valueChar(s.charAt(i+1));
                if (n2 <= n1)
                    result += n1;
                if (n2 > n1) {
                    result += n2 - n1;
                    i++;
                }
            }
            else {
                result += n1;
            }
        }
            
        return result;    
    }
}
