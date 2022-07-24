package practiseCoding;
import java.util.Arrays;
class TwoMax {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return MAth.max(nums[0] * nums[1]* nums[2],nums[nums.length - 1] * nums[nums.length - 2]
                        * nums[nums.length - 3]); //
    }
}
