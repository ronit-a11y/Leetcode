import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;

        while(right < nums.length){
            if(nums[right] == nums[left]){
                return true;
            }
            left++;
            right++;
        }
        return false;
        
    }
}