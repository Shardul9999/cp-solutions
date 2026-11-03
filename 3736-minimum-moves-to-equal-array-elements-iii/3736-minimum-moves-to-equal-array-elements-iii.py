class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxele = max(nums)
        moves = 0
        for x in nums:
            if x != maxele:
                moves += maxele - x
        return moves
        