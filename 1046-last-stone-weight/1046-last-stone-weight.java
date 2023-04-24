class Solution {
public int lastStoneWeight(int[] stones) {
        int stoneWeight = 0, stoneArrayLength = stones.length;

        while (stoneArrayLength > 1) {
            Arrays.sort(stones, 0, stoneArrayLength); 

            int lastElemIndex = stoneArrayLength - 1;
            stones[lastElemIndex - 1] = stones[lastElemIndex] - stones[lastElemIndex - 1];
            stoneArrayLength--;
        }

        if (stones.length >= 1) {
            stoneWeight = stones[0];
        }

        return stoneWeight;
    }
}