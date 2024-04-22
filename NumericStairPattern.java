import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(solve(N));
     	}
  
 public static ArrayList<ArrayList<Integer>> solve(int N) {
   ArrayList<ArrayList<Integer>> result = new ArrayList<>();
   for(int i=1;i<=N;i++){
       ArrayList<Integer> rows = new ArrayList<>();
       for(int j=1;j<=i;j++){
           rows.add(j);
       }
       result.add(rows);
   }
   return result;
   
    }
}