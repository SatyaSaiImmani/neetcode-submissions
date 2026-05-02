class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> solution = new HashSet<>();
        for (int i: nums){
            solution.add(i);
        }
        return solution.size() != nums.length;

    }
}