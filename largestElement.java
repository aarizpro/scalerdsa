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
       
        
          System.out.println(solve(rows,cols,A));
     	}
         
   
   public static ArrayList<Integer> solve(int rows,int cols,ArrayList<ArrayList<Integer>> A){
      ArrayList<Integer> largestElement = new ArrayList<>();
      for(int i=0;i<cols;i++){
          int maxElement=Integer.MIN_VALUE;
          for(int j=0;j<rows;j++){
              maxElement = Math.max(maxElement, A.get(i).get(j));
          }
          largestElement.add(maxElement);
      }
      return largestElement;
   }
}