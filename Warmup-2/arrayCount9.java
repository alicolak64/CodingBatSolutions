public class arrayCount9 {

    public int arrayCount9(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            int tempNumber = nums[i];
            
            if (tempNumber == 9)
                counter++;
                
        }

        return counter;
    }

}