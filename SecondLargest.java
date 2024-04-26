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
  if(A.size()<2){
    return -1;
      }
    int flargest = Integer.MIN_VALUE;
    int slargest = Integer.MIN_VALUE;
    for(int i=0;i<A.size();i++){
        int currElement = A.get(i);
        if(currElement>flargest){
            slargest=flargest;
            flargest=currElement;
         

        }else if(currElement>slargest&&currElement!=flargest){
            slargest=currElement;
        }
    } 
    if(slargest==Integer.MIN_VALUE){
      return -1;
    } 
   return slargest;
}

}