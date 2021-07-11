// Problem Link: https://leetcode.com/problems/number-of-islands/

class IslandCount {
    public int dfs(char[][] grid, int row, int col, int count){
        if (row < 0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0')
            return count;
        
        int[][] dir = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        grid[row][col] = '0';
        for(int[] d : dir){
            dfs(grid, row+d[0], col+d[1], count);
        }
        count++;
        return count;
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                count = dfs(grid, i, j, count);
        return count;
    }
}
