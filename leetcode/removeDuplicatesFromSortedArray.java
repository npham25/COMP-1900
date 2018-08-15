class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        
        int i = 0;
        for(int n = 1; n < nums.length; n++) {
            if (nums[n] != nums[i]) {
                i++;
                nums[i] = nums[n];
            }                             
        }
        return i + 1;       
    }
}
