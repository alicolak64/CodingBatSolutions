public class arrayFront9 {
    
    public boolean arrayFront9(int[] nums) {

        int length = nums.length;

        if (length <= 4) {
            for (int i = 0; i < length; i++) {
                int tempNumber = nums[i];
                if (tempNumber == 9)
                    return true;
            }
        } else {
            for (int i = 0; i <= 3; i++) {
                int tempNumber = nums[i];
                if (tempNumber == 9)
                    return true;
            }
        }

        return false;

    }

}