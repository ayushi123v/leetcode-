class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
         int [] ind = new int[n];

         for( List<Integer> i :edges){
            int t = i.get(1);
            ind[t]++;
         }

         List<Integer> r = new ArrayList<>();
         for( int j =0 ; j <n; j++){
            if(ind[j] == 0 ){
                r.add(j);
            }
         }
         return r;
    }
}