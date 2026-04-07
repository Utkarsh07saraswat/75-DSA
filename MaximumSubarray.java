class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max_so_far = nums[0];
        int curr_max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr_max = Math.max(nums[i], nums[i] + curr_max);
            max_so_far = Math.max(curr_max, max_so_far);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        MaximumSubarray obj = new MaximumSubarray();

        // Test Case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Output 1: " + obj.maxSubArray(nums1));

        // Test Case 2
        int[] nums2 = {1};
        System.out.println("Output 2: " + obj.maxSubArray(nums2));

        // Test Case 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Output 3: " + obj.maxSubArray(nums3));
    }
}