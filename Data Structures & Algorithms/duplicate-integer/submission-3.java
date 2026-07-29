class Solution {
    public boolean hasDuplicate(int[] nums) {
        //boolean isTrue = false;
        HashSet<Integer> st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }
        
        if(nums.length != st.size()){
            return true;
        }
        return false;
    }
}