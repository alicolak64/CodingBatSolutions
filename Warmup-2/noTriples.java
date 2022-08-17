public class noTriples {

    public boolean noTriples(int[] nums) {

        int s = nums.length - 2;
        
        for (int i = 0; i < s; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2])
                return false;
        }

        return true;

    }

}