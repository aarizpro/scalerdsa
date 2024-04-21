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
        int difference = calculateOddEven(A);
        System.out.println(difference);    
        }
        
                  
	}
    public static int calculateOddEven(int [] A){
        int oddCount=0;
        int evenCount =0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }     
        }
        return Math.abs(evenCount-oddCount);
       
    }
    
}