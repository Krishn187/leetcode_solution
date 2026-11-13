class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][] visit = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visit[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visit);
                    count++;
                }
            }
        }
        return count;
        
    }
    void dfs(char[][] grid , int i,int j,boolean[][]visit){
        if(i<0 || j<0 || i>=grid.length|| j>= grid[0].length || grid[i][j]=='0'||visit[i][j]){
            return ;
        }
        visit[i][j]=true;
        dfs(grid,i,j+1,visit);
        dfs(grid,i,j-1,visit);
        dfs(grid,i+1,j,visit);
        dfs(grid,i-1,j,visit);
    }
}