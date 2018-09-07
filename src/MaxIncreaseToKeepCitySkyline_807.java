/*
例子：
输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
输出： 35
解释：
The grid is:
[ [3, 0, 8, 4],
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]
从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]

在不影响天际线的情况下对建筑物进行增高后，新数组如下：

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]
 */
public class MaxIncreaseToKeepCitySkyline_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        int []verticalArray = getVerticalArray(grid);
        int []horizontalArray = getHorizontalArray(grid);

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                res+=Math.min(horizontalArray[i],verticalArray[j])-grid[i][j];
            }
        }

        return res;
    }

    //竖直天际线，每列的max
    public int[] getVerticalArray(int[][]grid)
    {
        int [] res = new int[grid.length];
        for(int i=0;i<grid[0].length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++)
            {
                max = max>grid[j][i]?max:grid[j][i];

            }
            res[i] = max;
        }
        return res;
    }

    //水平天际线列表 每行的max
    public int[] getHorizontalArray(int[][]grid)
    {
        int [] res = new int[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++)
            {
                max = max>grid[i][j]?max:grid[i][j];

            }
            res[i] = max;
        }
        return res;

    }
}
