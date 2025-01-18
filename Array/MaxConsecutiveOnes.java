public class MaxConsecutiveOnes {

    public static int findConsecutiveOnes(int[] nums) {
        int Maxcount = 0;
        int currentCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCounter++;
                Maxcount = Math.max(Maxcount, currentCounter);
            } else {
                currentCounter = 0;
            }
        }
        return Maxcount;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
        System.out.println(findConsecutiveOnes(nums));
    }
}