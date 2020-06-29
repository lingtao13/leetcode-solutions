package solutions20_50;

/**
 * created by Nelson Peng on 2020/6/27
 **/
public class FirstMissingPositive {
    public static int fitstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(fitstMissingPositive(nums));

    }
}
