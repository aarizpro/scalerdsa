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
        int B = scn.nextInt();
        System.out.println(solve(A,B));
                  
	}
    public static ArrayList<Integer> solve(ArrayList<Integer> A,int B){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            result.add(A.get(i)+B);
        }
        return result;
    }
    
}