public class test1 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; // Count of non-zero elements

        // Move all the non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.print("Input: ");
        printArray(nums);
        moveZeroes(nums);
        System.out.print("Output: ");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
