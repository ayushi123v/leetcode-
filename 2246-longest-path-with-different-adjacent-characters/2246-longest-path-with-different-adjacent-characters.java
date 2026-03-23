class Solution {
    int ans =  1;
    public int longestPath(int[] parent, String s) {
         
         int n = parent.length;

         List<Integer>[] tree= new ArrayList[n];
         for(int i =0 ; i<n ; i++) tree[i] = new ArrayList<>();

         for(int i =1;i<n ;i++){
            tree[parent[i]].add(i);
         }
         dfs(0,tree, s);
         return ans;


    }

    private int dfs (int node , List<Integer> [] tree , String s){
        int max1 =0 , max2 =0;

        for(int child :tree[node]){
            int ch= dfs (child , tree , s);

            if(s.charAt (child ) == s.charAt(node ))continue;


            if(ch> max1){
                max2 = max1;
                max1 = ch;

            }
            else if (ch>max2){
                max2 = ch;
            }
        }
        ans= Math.max(ans, max1 + max2 + 1);

        return max1 + 1;
    }
}