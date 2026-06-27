class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp = 0;
        int rp = n-1;
        int area = 0;
        while(lp<rp){
            
                int wd = rp-lp;
                int he= Math.min(height[lp], height[rp]);
                int water =wd * he;
                area = Math.max(area , water);

                if(height[lp]<height[rp]){
                    lp++;
                }
                else{
                    rp --;
                }
            
        }
        return area;
    }
}    