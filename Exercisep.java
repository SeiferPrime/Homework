import java.util.Scanner;
import java.util.Arrays;
class Exercisep{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Integer K = Integer.parseInt(args[0]);
		int[] M = new int[10];
		int N = 1;
		boolean q = true;
		int x = 10 - K;
		System.out.println("Enter an array of 10 numbers through spaces");
		for (int i = 0; i < M.length; i++) {
			M[i] = in.nextInt();
		}
	    for (int i = M.length - 1; i >= M.length / 2; i--) {
			int a = M[i];
			M[i] = M[M.length - i - 1];
			M[M.length - i - 1] = a;
		}
		System.out.println(Arrays.toString (M));
		for (int i = (M.length - x) - 1; i >= (M.length - x) / 2; i--) {
			int a = M[i];
			M[i] = M[(M.length - x) - i - 1];
			M[(M.length - x) - i - 1] = a;
		} System.out.println(Arrays.toString (M));
		for (int i = K; i <= (M.length + K) / 2; i++) {
			int a = M[i];
			M[i] = M[(M.length + K) - i - 1];
			M[(M.length + K) - i - 1] = a;
		} System.out.println(Arrays.toString (M));
	}
}