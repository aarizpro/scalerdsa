import java.util.*;
import java.lang.*;
import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
          
        for (int i = 0; i < N; i++) {
            A.add(scn.nextInt());
        }
        
        System.out.println(wave(A));
                  
	}
    public static ArrayList<Integer> wave(ArrayList<Integer> A){
        Collections.sort(A); 
        for(int i=0;i<A.size()-1;i+=2){
            if(i+1<A.size()){
                int temp = A.get(i);
                A.set(i, A.get(i+1));
                A.set(i+1,temp);
                
            }
        }
        return A;
    }
    
}