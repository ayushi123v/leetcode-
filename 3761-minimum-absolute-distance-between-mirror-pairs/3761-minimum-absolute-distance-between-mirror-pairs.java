class Solution {
    public int minMirrorPairDistance(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      int dis = Integer.MAX_VALUE;

      for(int i = 0 ; i<nums.length ; i++){
        int rev = reverse(nums[i]);

        if(map.containsKey(nums[i])){
            dis = Math.min(dis , i-map.get(nums[i]));
        }
        map.put(rev,i);
      } 
      return dis == Integer.MAX_VALUE? -1 :dis; 

    }
    private int reverse(int x ){
        int rev = 0 ; 
        while(x>0){
            rev= rev* 10 +(x% 10);
            x/=10;
        }
        return rev;
    }
}