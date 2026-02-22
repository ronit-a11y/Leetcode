class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int prev = -1;
        int gap = 0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '1'){
                if(prev != -1){
                    gap = Math.max(gap,i-prev);
                }
                prev = i;
            }
        }
        return gap;
        
    }
}