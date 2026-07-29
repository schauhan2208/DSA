class Solution {
    public boolean hasDuplicate(int[] nums) {
        //boolean isTrue = false;
        HashSet<Integer> st = new HashSet<>();

        for(int num : nums){
            if(!st.add(num)){
                return true;
            }
        }
        return false;
    }
}