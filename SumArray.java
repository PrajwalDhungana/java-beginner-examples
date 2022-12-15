// Find the sum of given array [ 1, 2, 3, 4, 5, 6, 11, 26 ]

class SumArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 11, 26 };
        for (int num : nums) {
            sum += num;
            System.out.println(sum);
        }
        System.out.println("Total Sum: " + sum);
    }
}
