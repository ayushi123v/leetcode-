class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();

        boolean[] dp = new boolean[n];

        dp[0] = true;

        int r = 0;

        for (int i = 1; i < n; i++) {

            if (i - minJump >= 0 && dp[i - minJump]) {
                r++;
            }

            if (i - maxJump - 1 >= 0 && dp[i - maxJump - 1]) {
                r--;
            }

            dp[i] = (r > 0 && s.charAt(i) == '0');
        }

        return dp[n - 1];
    }
}