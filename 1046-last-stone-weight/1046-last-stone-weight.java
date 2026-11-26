class Solution {
    public int lastStoneWeight(int[] stones) {
       List<Integer> l1 = new ArrayList<>();
       for(int i=0;i<stones.length;i++) {
            l1.add(stones[i]);
       }
       int x=0,y=0;
      
       while(l1.size()> 1){
         Collections.sort(l1);
          x = l1.remove(l1.size()-2);;
          y = l1.remove(l1.size()-1);
         
            
           
                l1.add(y-x);
            
         
         
       }
      if(l1.size()>0){
        return l1.get(0);
      }
      return x;
    }
}