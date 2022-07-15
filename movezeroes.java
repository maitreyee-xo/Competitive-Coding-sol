package practiseCoding;

import java.util.Arrays;

public class movezeroes {

//    public void moveZeroes(int [] arr)
//    {
//        Arrays.sort(arr);
//        int count = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            if(arr[i] == 0)
//            {
//                count++;
//            }
//        }
//        for(int i = 0; i < count; i++)
//        {
//            arr[arr.length-1] = 0;
//        }
//    }

    public static void main(String[] args) {
        int [] nums = {2,4,54,3,3,34,4,545,5,6,0,0,0,7};
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        int[] temp = new int[nums.length + count];

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0)

            {

            }
            else
            {
                temp[i] = nums[i];
            }

        }
        nums = temp;

        for(int i = 0; i < count; i++)
        {
            temp[temp.length - 1] = 0;
        }

        for(int x : nums)
        {
            System.out.println(x);
        }
    }
    }

