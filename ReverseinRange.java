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
       int B = scn.nextInt();
       int C = scn.nextInt();
       System.out.println(solve(A,B,C));
     	}
         
  
 public static ArrayList<Integer> solve(ArrayList<Integer> A,int B,int C) {
 if (B < 0 || C >= A.size() || B > C) {
         return A;
     }

    while (B < C) {
            int temp = A.get(B);
            A.set(B, A.get(C));
            A.set(C, temp);

            B++;
            C--;
        }

        return A; 
}
}