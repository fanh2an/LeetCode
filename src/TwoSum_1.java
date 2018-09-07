import java.util.HashMap;

/*
    给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
    你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

    示例:

    给定 nums = [2, 7, 11, 15], target = 9
    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
 */


public class TwoSum_1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        for (int i = 0; i < 2; i++) {
            System.out.print(res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int []res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++)
        {
            int t = target - nums[i];
            if(map.containsKey(t)&& map.get(t)!=i)
            {
                res[0]=i;
                res[1]=map.get(t);
            }
        }

        return res;
    }
}
