//time o(n)
//space o(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int sort = 1;
        int count = 1;
        
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if(count <= 2) {
                nums[sort] = nums[i];
                sort += 1;
            }
        }
        
        return sort;
        
    }
}