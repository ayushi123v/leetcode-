class Solution {
    public int reverseBits(int n) {
     
            // String binary = Integer.toBinaryString(n) ;
            String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
            String rev = new StringBuilder(binary).reverse().toString();
            long ans = Long.parseLong(rev, 2);
        
        return (int)ans ;
        
    }
}