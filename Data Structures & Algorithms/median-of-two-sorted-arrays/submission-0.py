class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        num = nums1 + nums2
        num.sort();
        l = len(num)
        res = 0

        if (l % 2) == 0:
            res =( num[(l//2) - 1] + num[l//2] )/2
        else:
            res = num[l//2]

        return res