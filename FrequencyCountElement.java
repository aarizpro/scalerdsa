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
        System.out.println(frequencyCount(A,B));
                  
	}
    public static int frequencyCount(ArrayList<Integer> A,int B){
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==B){
                count++;
            }
        }
        return count;
    }
    
}