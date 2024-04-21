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
        int B = scn.nextInt();
      System.out.println(countPair(A,B));
                
	}
    public static int countPair(int [] A,int B){
       int sum=0;
       int count=0;
       for(int i=0; i<A.length;i++){
           for(int j=i+1;j<A.length;j++){
            sum = A[i]+A[j];
            if(sum==B){
             count++;         
            }
          }
              
         }
       return count;
    }
   
}