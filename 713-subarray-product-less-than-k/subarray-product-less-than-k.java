class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int si =0;
       int ei =0;
       int p =1;
       int ans =0;
       while(ei<nums.length){
        //growing
        p *= nums[ei];
        //shrinking
        while(p>=k && si<=ei){
            p /= nums[si];
            si++;
        }
        //ans calculation
        ans += (ei-si+1);
        ei++;
       }
       return ans;
    }
}