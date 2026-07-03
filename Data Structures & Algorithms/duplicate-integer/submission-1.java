class Solution {
    public boolean hasDuplicate(int[] nums) {
        //boolean isTrue = false;
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }
}