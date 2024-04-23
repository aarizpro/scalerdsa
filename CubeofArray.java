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
  
 public static ArrayList<Long> solve(ArrayList<Integer> A) {
    ArrayList<Long> result = new ArrayList<>();    
        for(int i=0; i<A.size();i++){
           long cube = (long)A.get(i)*A.get(i)*A.get(i);
           result.add(cube);
        }

        return result;
    
    }
}