class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int rows= grid.length;
     int cols= grid[0].length;
     boolean[][] visited= new boolean[rows][cols];
     int maxArea=0;
     for(int r=0; r<rows; r++){
        for(int c=0; c<cols; c++){
            if(grid[r][c]==1 && !visited[r][c])
            maxArea= Math.max(maxArea,dfs(grid,visited,r,c));
        }
     } 
     return maxArea;  
    }
    private int dfs(int[][] grid, boolean[][] visited,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length) return 0;
        if(grid[r][c]==0|| visited[r][c]) return 0;
        visited[r][c]= true;
        int area=1;
        area+=dfs(grid,visited,r-1,c);
        area+=dfs(grid,visited,r+1,c);
        area+=dfs(grid,visited,r,c+1);
        area+=dfs(grid,visited,r,c-1);
        return area;
    }
}
