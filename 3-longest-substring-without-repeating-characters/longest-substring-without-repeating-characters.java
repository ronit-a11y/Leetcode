class Solution {
    public int lengthOfLongestSubstring(String s) {
        int si = 0;
        int ei = 0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        while(ei<s.length()){
            char ch = s.charAt(ei);
            while(set.contains(ch)){
                set.remove(s.charAt(si));
                si++;
            }
            set.add(ch);
            //ans calculation
            ans = Math.max(ei-si+1 , ans);
            ei++;
        }
        return ans;
        
    }
}