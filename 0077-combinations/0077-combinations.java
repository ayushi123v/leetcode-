class Solution {
    List<List<Integer>> r = new ArrayList<>();
    void solve(int num , int to , int k , List<Integer> ans ){
        if(num == to+1){
            if(ans.size() == k ){
                r.add(new ArrayList<>(ans));
            }
            return ;
        }
        ans.add(num);
        solve(num +1 , to , k , ans );
        ans.remove (ans.size()-1);
        solve(num+1, to , k , ans);


    }
    void solve2(int num , int to , int k , List<Integer> ans){
        if(ans.size() == k ){
            r.add(new ArrayList<>(ans));
            return ;
        }
        for(int i = num ; i<= to ; i++){
            ans.add(i);
            solve2(i+1,to ,k , ans );// no repeat
            ans.remove(ans.size()-1); //dubara se wapas jao 
        }
    }
    public List<List<Integer>> combine (int n, int k  ){
        List<Integer> ans = new ArrayList<>();
        solve(1,n, k , ans );
        return r ;
    }
}