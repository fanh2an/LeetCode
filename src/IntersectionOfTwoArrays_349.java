import java.util.ArrayList;

/*
给定两个数组，编写一个函数来计算它们的交集。

示例 1:

输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2]
示例 2:

输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [9,4]
说明:

输出结果中的每个元素一定是唯一的。
我们可以不考虑输出结果的顺序。
 */
public class IntersectionOfTwoArrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
            list1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            list2.add(nums2[i]);


        for(int i=0;i<list1.size();i++)
            if(list2.contains(list1.get(i))&& !res.contains(list1.get(i)))
                res.add(list1.get(i));

        int []arr = new int[res.size()];
        for(int i=0;i<res.size();i++)
            arr[i]= res.get(i);
        return arr;
    }
}
