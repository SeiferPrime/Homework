import java.util.Scanner;
class Exercise43{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] M = new int[10];
		int N = 1;
		int K = Integer.parseInt(args[0]);
		boolean q = true;
		System.out.println("Enter an array of 10 numbers through spaces");
		for (int i = 0; i < M.length; i++) {
			M[i] = in.nextInt();
		}
		for (int i = 0; i < M.length; i++) {
			N = N * M[i];	
		}
		if (N != 0 && q ==true) {
			for (int i = 0; i < M.length; i++) {
				if (K < M[i]) {
					q = false;
					System.out.println(i + 1);	
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