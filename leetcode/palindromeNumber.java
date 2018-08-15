class Solution {
    public boolean isPalindrome(int x) {
        //d: number of digits in x - 1 (no count the first digit)
        if (x < 0)
            return false;

        int d = 1;
        while ( x / d >= 10) 
            d *= 10;
      
        //continue loop until reach the middle digit
        while (x != 0) {
            int last = x % 10; //last digit of x
            int first = x / d; // first digit of x
            if (first != last)
                return false;
            else {
                x = (x%d) / 10; // delete the first and last from x -> create new x
                d = d / 100; //-> no more first, last 
            }
        }
        return true;
        
    }
}
