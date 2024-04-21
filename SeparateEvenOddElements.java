import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for(int j=0;j<T;j++){
        int N = scn.nextInt();
        
        int[] A = new int[N];
                 for (int i = 0; i < N; i++) {
                    A[i] = scn.nextInt();
                    }
        calculateOddEven(A);
        
        }
        
                  
	}
    public static void calculateOddEven(int [] A){
       ArrayList<Integer> oddElements = new ArrayList<Integer>();
       ArrayList<Integer> evenElements = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                evenElements.add(A[i]);
            }else{
                oddElements.add(A[i]);
            }     
        }
        printArrayElements(evenElements);
        printArrayElements(oddElements);
    }
    public static void printArrayElements(ArrayList<Integer> list){
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
    }
}