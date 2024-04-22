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
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(scn.nextInt());
            }
            A.add(row);
        }

       int B = scn.nextInt();
        
          System.out.println(solve(A,B));
     	}
  
 public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,int B) {
   ArrayList<ArrayList<Integer>> result = new ArrayList<>();
   int rows = A.size();
   int cols = A.get(0).size();
   for(int i=0;i<rows;i++){
       ArrayList<Integer> subCols = new ArrayList<>();
       for(int j=0;j<cols;j++){
           int pro = A.get(i).get(j)*B;
           subCols.add(pro);
       }
       result.add(subCols);
   }
   return result;
   
    }
}