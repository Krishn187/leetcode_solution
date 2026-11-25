class Solution {
    public int islandPerimeter(int[][] grid) {
        int s=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                  s+= sum(grid,i+1,j)+sum(grid,i-1,j)+sum(grid,i,j-1)+sum(grid,i,j+1);
                }
                
            }
        }
        return s;
    }
    public int sum (int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1){
            return 1;
        }
        
        
         
        
        return 0;
            }
}