import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c) {
      Set<Integer> dice = new HashSet<>();
      dice.add(a);
      dice.add(b);
      dice.add(c);
     
     if(dice.size() == 3){
         return (a+b+c);
     }else if(dice.size() == 2){
         return  (a + b + c) * (a*a + b*b + c*c );
     }else if(dice.size() == 1){
         return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
     }
     return 0;
    }
}