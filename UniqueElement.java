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
          System.out.println(solve(A));
     	}
  
 public static int solve(ArrayList<Integer> A) {
    int uniqueElement = 0;
        
        for(int i=0; i<A.size();i++){
            uniqueElement ^= A.get(i);
        }

        return uniqueElement;
    
    }
}