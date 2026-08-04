class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0, time=0;
        Queue<int[]> q= new ArrayDeque<>();
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]==1) fresh++;
                if(grid[r][c]==2) q.offer(new int[]{r,c});
            }
        }
        int[][] direction= {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()&& fresh>0){
            int size= q.size();
            for(int i=0; i<size;i++){
                int[] cur= q.poll();
                int r= cur[0];
                int c= cur[1];
                for(int[] dir: direction){
                    int row= r+dir[0];
                    int col= c+dir[1];
                    if(row<0|| col<0|| row>=grid.length|| col>=grid[0].length || grid[row][col]!=1) continue;
                    grid[row][col]=2; fresh--;  
                    q.offer(new int[]{row,col});              }

            }
            time++;
        }
        return fresh==0? time:-1;
    }
}
