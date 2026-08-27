class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        map = {}
        res, count = 0, 0
        n = len(nums)
        for num in nums:
            map[num] = map.get(num,0) + 1
            res = num if map[num] > count else res
            count  = max(map[num], count)
        return res
        
        