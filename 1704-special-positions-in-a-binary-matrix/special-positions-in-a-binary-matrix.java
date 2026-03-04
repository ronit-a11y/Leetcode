class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int colm = mat[0].length;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                if(mat[i][j]==1){
                    int rowcount = 0;
                    int colmcount = 0;
                    for(int k=0;k<colm;k++){
                        rowcount += mat[i][k];
                    }
                    for(int k=0;k<row;k++){
                        colmcount += mat[k][j];
                    }
                    if(rowcount == 1 && colmcount ==1){
                        count++;
                    }
                }
            }
        }
        return count;
       
    }
}