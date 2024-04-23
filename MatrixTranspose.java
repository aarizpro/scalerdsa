import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row =new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(scn.nextInt());
            }
            A.add(row);
        }
         System.out.println(solve(A));
     	}
  
 public static ArrayList<ArrayList<Integer>>  solve(ArrayList<ArrayList<Integer>> A) {
    int rows = A.size();
    int cols = A.get(0).size();
    ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
    for(int i=0; i<rows; i++){
        transpose.add(new ArrayList<>());
    }  
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols;j++){
            transpose.get(j).add(A.get(i).get(j));
        }
    }  
       return transpose;
    }
}