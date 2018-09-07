/*
给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。

说明：每次只能向下或者向右移动一步。

示例:

输入:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
输出: 7
解释: 因为路径 1→3→1→1→1 的总和最小。
 */
public class MinimumPathSum_64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][]path = new int[m][n];
        path[0][0] = grid[0][0];
        for(int i=1;i<m;i++)
            path[i][0] = grid[i][0]+path[i-1][0];
        for(int j=1;j<n;j++)
            path[0][j] = grid[0][j]+path[0][j-1];

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                path[i][j] =path[i-1][j]>path[i][j-1]?path[i][j-1]+grid[i][j]:path[i-1][j]+grid[i][j];
            }
        }
        return path[m-1][n-1];
    }
}
