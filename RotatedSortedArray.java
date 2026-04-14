// Search in Rotated Sorted Array

class RotatedSortedArray {

    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedSortedArray obj = new RotatedSortedArray();

        // Test Case 1
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println(obj.search(nums1, target1)); // Output: 4

        // Test Case 2
        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.println(obj.search(nums2, target2)); // Output: -1

        // Test Case 3
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(obj.search(nums3, target3)); // Output: -1
    }
}
