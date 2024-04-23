import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            A.add(scn.nextInt());
        }
        for(int i=0;i<M;i++){
            B.add(scn.nextInt());
        }
        
         System.out.println(solve(A,B,N,M));
     	}
  
 public static ArrayList<ArrayList<Integer>>  solve(ArrayList<Integer> A,ArrayList<Integer> B,int N,int M) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for(int i=0; i<M; i++){
        ArrayList<Integer> row = new ArrayList<>();
        for(int j=0;j<N;j++){
            if(A.get(j)%B.get(i)==0){
                row.add(A.get(j));
            }
        }
        result.add(row);
    }  
     
       return result;
    }
}