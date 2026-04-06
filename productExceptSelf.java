import java.util.*;

class productExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        productExceptSelf obj = new productExceptSelf();

        // Input 1
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = obj.productExceptSelf(nums1);
        System.out.println("Output 1: " + Arrays.toString(result1));

        // Input 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = obj.productExceptSelf(nums2);
        System.out.println("Output 2: " + Arrays.toString(result2));
    }
}