import java.util.Scanner;
class Exercise42{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] M = new int[10];
		double N = 0;
		for (int i = 0; i < M.length; i++) {
			M[i] = in.nextInt();
		}
		for (int i = 0; i < M.length; i++) {
			N = N + M[i];
		}System.out.println(N / M.length);
}
}