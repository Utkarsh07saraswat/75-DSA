import java.util.*;

class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println("Output for nums1: " + obj.containsDuplicate(nums1)); // true
        System.out.println("Output for nums2: " + obj.containsDuplicate(nums2)); // false
        System.out.println("Output for nums3: " + obj.containsDuplicate(nums3)); // true
    }
}