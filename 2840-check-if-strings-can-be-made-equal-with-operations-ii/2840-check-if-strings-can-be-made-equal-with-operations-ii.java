class Solution {
    public boolean checkStrings(String s1, String s2) {
      List<Character> s1e = new ArrayList<>();
      List<Character> s2e = new ArrayList<>();
      List<Character> s1o = new ArrayList<>(); 
      List<Character> s2o = new ArrayList<>();

      for( int i =0 ; i<s1.length(); i++){
        if(i%2 ==0 ){
             s1e.add(s1.charAt(i));
             s2e.add(s2.charAt(i));
        }else{
            s1o.add(s1.charAt(i));
             s2o.add(s2.charAt(i));
        }

        
      }
      Collections.sort(s1e);
      Collections.sort(s2e);
      Collections.sort(s2o);
      Collections.sort(s1o);

      return s1e.equals(s2e) && s1o.equals(s2o);

    }
}