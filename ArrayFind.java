import java.util.Scanner;
class ArrayFind{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] M = new int[10];
		int N = Integer.parseInt(args[0]);
		System.out.println("Enter an array of 10 numbers through spaces");
		for (int i = 0; i < M.length; i++) {
			M[i] = in.nextInt();
		}
        for (int i = 0; i < M.length; i++) {
			if (N == M[i]) {
				System.out.print(i + " ");	
				//break;
			}
		}
	}
}