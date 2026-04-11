class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length ;
        int [] l = new int [n+1];
        int [] sl = new int [n+1];

        for (int i = 0 ; i<=n ; i++){
            l[i] = -1;
            sl[i] =-1;

        }
        int res = Integer.MAX_VALUE;

        for(int i =0 ; i<n ; i++){
            int num = nums[i];
            if(sl[num] != -1){
                res = Math.min (res, 2 * (i-sl[num]));
            }
            sl[num] =l[num];
            l[num] =i;

        }
        return res == Integer.MAX_VALUE ? -1 : res ;
    }
}