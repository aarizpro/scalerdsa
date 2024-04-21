import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int N= scn.nextInt();
         int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
          ArrayList<Integer> result = new ArrayList<>();
          for(int i=0;i<N;i++){
              if(arr[i]%5==0 && arr[i]%7==0){
                  result.add(arr[i]);
              }
          }
          System.out.println(result);
        
	}
    
}