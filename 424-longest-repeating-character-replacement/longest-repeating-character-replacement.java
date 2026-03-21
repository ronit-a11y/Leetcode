class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int si =0;
        int max =0;
        int ans =0;
        for(int ei =0;ei<s.length();ei++){
            char ch = s.charAt(ei);
            freq[ch - 'A']++;
            max = Math.max(max,freq[ch - 'A']);
            int size = ei - si +1;
            if(size - max >k){
                freq[s.charAt(si)-'A']--;
                si++;
            }
            ans = Math.max(ans,ei-si+1);
        }
        return ans;

    }
}