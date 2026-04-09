// Find Minimum in Rotated Sorted Array

class findMin {

    public static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};

        System.out.println("Output 1: " + findMin(nums1)); // 1
        System.out.println("Output 2: " + findMin(nums2)); // 0
        System.out.println("Output 3: " + findMin(nums3)); // 11
    }
}
