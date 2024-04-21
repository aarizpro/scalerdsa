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
       
      System.out.println(consDupli(A));
                
	}
    public static boolean consDupli(int [] A){
       for(int i=1;i<A.length;i++){
           if(A[i]==A[i-1]){
               return true;
           }
       }
       return false;
    }
   
}