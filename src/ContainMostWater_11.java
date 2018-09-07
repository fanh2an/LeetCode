/*
    给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
    说明：你不能倾斜容器，且 n 的值至少为 2。

    示例:

    输入: [1,8,6,2,5,4,8,3,7]
    输出: 49

    思路：
    1、暴力法，会超时
    2、从距离最远的两个值开始，向中间遍历，直到两个坐标点重合。

    假设左边的坐标点是left，右边的坐标点是right，当height[left]<height[right]时，只需要考虑left向右移动的情况，因为right向左移动的结果都只会比原来的小。反之亦然。

 */
public class ContainMostWater_11 {
    public int maxArea(int[] height) {
        int max = 0;
        if(height.length<2)
            return 0;

        int i = 0;
        int j = height.length-1;
        while(i<j)
        {
            max = Math.max(max,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }

        return max;

    }
}
