class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] solution = new int[2*nums.length];
        System.arraycopy(nums, 0, solution, 0, nums.length);
        System.arraycopy(nums, 0, solution, nums.length, nums.length);
        System.gc();
        return solution;
    }
}