class Solution {
    public int coinChange(int[] coins, int amount) {

        // dp[i] = minimum number of coins required to make amount i
        int[] dp = new int[amount + 1];

        // Initialize all amounts as "impossible"
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        // Base case
        dp[0] = 0;

        // Calculate the answer for every amount from 1 to amount
        for (int i = 1; i <= amount; i++) {

            // Try every coin
            for (int coin : coins) {

                // We can only use this coin if it is not larger than the current amount
                if (i >= coin) {

                    // Take the minimum between:
                    // 1. Current best answer
                    // 2. Using this coin + best answer for remaining amount
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        // If the amount is still impossible to make, return -1
        //dp array ka value update kr rhe h na hm min value se to agar 
        // dp mei abhi bhi amount+1 h value for the amount we are looking
        // matlab koi min coin nahi mila amount k liye-> return -1
        if (dp[amount] == amount + 1) {
            return -1;
        }

        return dp[amount];
    }
}