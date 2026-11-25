class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r>=mat.length && c>=mat[0].length) return mat;
        if(r*c < mat.length*mat[0].length) return mat;
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                l1.add(mat[i][j]);
            }
        }
        int[][] ans = new int[r][c];
        int i=0,j=0;
        for(int a : l1){
            ans[i][j]=a;
            j++;
            if(j==c){
                i++;
                j=0;
            }
            

        }
        return ans;

    }
}