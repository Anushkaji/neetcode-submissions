class Solution {
    public int numIslands(char[][] grid) {
        int rows= grid.length, cols=grid[0].length;
        boolean[][] visted = new boolean[rows][cols];
        int islands=0;
        for(int r=0; r<rows;r++)
        {
            for(int c=0; c<cols; c++){
                if(grid[r][c]=='1' && !visted[r][c])
                islands++;
                dfs(grid,visted,r,c);
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, boolean[][] visted,int r,int c){
        if(r<0 || c<0|| r>=grid.length || c>=grid[0].length) return;
        if(grid[r][c]=='0' || visted[r][c]) return;
         visted[r][c]= true;
         dfs(grid,visted,r-1,c);
         dfs(grid,visted,r+1,c);
         dfs(grid,visted,r,c-1);
         dfs(grid,visted,r,c+1);
    }

}
