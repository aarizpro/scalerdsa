import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
         int N = scn.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) 
        {
          A[i] = scn.nextInt();
        }
        freqCount(A);
        
        
        
                  
	}
    public static void freqCount(int [] A){
       ArrayList<Integer> result = new ArrayList<Integer>();
       for(int i=0; i<A.length;i++){
           int count=0;
           for(int j=0;j<A.length;j++){
               if(A[i]==A[j]){
                   count++;
               }
              
           }
            result.add(count);
       }
       System.out.println(result);
    }
   
}