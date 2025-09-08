class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        //first add all the rotten oranges in queue
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j,0}); //level 0
                }
            }
        }

        //mark adj nodes as rotten and push in queue till its not empty

        int maxMinutes = 0;
        while(!queue.isEmpty()){
            int[] curr = queue.poll();

            int x = curr[0], y = curr[1], level = curr[2];

            //top
            if(x>0 && grid[x-1][y] ==1){
                grid[x-1][y]=2;
                queue.add(new int[]{x-1, y, level+1});
            }

            //bottom
            if(x<m-1 && grid[x+1][y]==1){
                grid[x+1][y] = 2;
                queue.add(new int[]{x+1, y, level+1});
            }

            //left
            if(y>0 && grid[x][y-1]==1){
                grid[x][y-1] = 2;
                queue.add(new int[]{x, y-1, level+1});
            }

            //right
            if(y<n-1 && grid[x][y+1]==1){
                grid[x][y+1]=2;
                queue.add(new int[]{x, y+1, level+1});
            }

            maxMinutes = Math.max(level, maxMinutes);
        }

        //finally run over each element in check if any fresh is remaining

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }

        return maxMinutes;
        
    }
}