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
  int n = A.size();
     int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, A.get(i));
        }
        int totalTime = 0;
        for (int i = 0; i < n; i++) {
            totalTime += (maxElement - A.get(i));
        }

        return totalTime;
}
}