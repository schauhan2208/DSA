class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int i=0;
        while(k>0){
            result[i] = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            map.remove(result[i]);
            i++;
            k--;
        }
        return result;
    }
}
