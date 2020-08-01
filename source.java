import java.util.*;

class Solution {
     public int solution(int[] A) {
  
  Arrays.sort(A);

       for (int i = 0, j = 1; i < A.length; i++, j++) {
           if (j < A.length && A[i] == A[j]){
               i++;
               j++;
          }
           else {
                return A[i];
      }
         }
    
       return 0;
    }
}
