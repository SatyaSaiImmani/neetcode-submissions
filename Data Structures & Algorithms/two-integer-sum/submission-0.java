class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> track = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(track.containsKey(nums[i])){
                int[] solution = {track.get(nums[i]), i};
                return solution;
            }
            track.put(target-nums[i], i);
        }
        return new int[2];
    }
}
