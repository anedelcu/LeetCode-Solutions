class Solution {
    public int coinChange(int[] coins, int amount) {
        
        // create an array to keep track of min number of coins for each amount
        int[] dp = new int[amount + 1];
        
        // fill the array with amount + 1
        
        Arrays.fill(dp, amount + 1);
        
        // we need 0 coins to make 0 amount
        dp[0] = 0;
        
        // 
        for(int i  = 1; i <= amount; i++) {
            for(int j = 0; j < coins.length; j++) {
                if(coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        if(dp[amount] <= amount) {
            return dp[amount];
        }
        
        return -1;
    }
}