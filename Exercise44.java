import java.util.Scanner;
import java.util.Arrays;
class Exercise44{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] M = new int[10];
		int K = Integer.parseInt(args[0]);
		int N = 1;
		boolean q = true;
		System.out.println("Enter an array of 10 numbers through spaces");
		for (int i = 0; i < M.length; i++) {
			M[i] = in.nextInt();
		}
		for (int i = 0; i < M.length; i++) {
			N = N * M[i];	
		}
		for (int i = M.length - 1; i >= M.length / 2; i--) {
			int a = M[i];
			M[i] = M[M.length - i - 1];
			M[M.length - i - 1] = a;
		}
		if (N != 0 && q ==true) {
			for (int i = 0; i < M.length; i++) {
				if (K < M[i]) {
					q = false;
					System.out.println(10 - i);	
					break;
				}
			}
		} for (int i = 0; i < M.length; i++) {
			if (K > M[i] && q == true) {
				System.out.println("0");
				break;
			}
		}
			
		
}
}