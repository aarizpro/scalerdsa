import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<N;i++){
            A.add(scn.nextInt());
        }
        int M = scn.nextInt();
        
         System.out.println(solve(A,M));
     	}
  
 public static int solve(ArrayList<Integer> A,int M) {
   HashSet<Integer> seenElements = new HashSet<>();
   for(int i=0;i<A.size();i++){
       int C = A.get(i);
       int temp = M-C;
       if(seenElements.contains(temp)){
           return 1;
       }
       seenElements.add(C);
    }
    return 0;
    }
}