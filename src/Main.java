public class Main {
    public static void main(String[] args)
    {
        int []nums = {3,2,2,3};
        int val = 3;
        System.out.print(removeElement(nums,val));
        System.out.println();
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static  int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int count = 0;
        while(i<=j)
        {
            if(nums[i]==val)
            {
                if(nums[j]==val)
                {
                    j--;
                }
                else
                {
                    swapelement(i,j,nums);
                    j--;
                }
            }
            else
            {
                i++;
            }

        }
        for(int m=0;m<nums.length;m++)
        {
            if(nums[m]!=val)
                count++;
            else
                break;

        }

        return count;
    }

    public static void swapelement(int i,int j,int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
