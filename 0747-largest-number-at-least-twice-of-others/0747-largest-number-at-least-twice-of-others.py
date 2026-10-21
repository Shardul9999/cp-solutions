class Solution(object):
    def dominantIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_val = max(nums)
        for x in nums:
            if x == max_val:
                continue
            if max_val < x * 2:
                return -1
        return nums.index(max_val)
