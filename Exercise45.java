import java.util.Scanner;
class Exercise45{
    public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    double K = Double.parseDouble(args[1]);
    Scanner in = new Scanner(System.in);
    int[] ar = new int[N];
    System.out.println("Enter an array of N integrs");
    for (int i = 0; i < ar.length; i++) {
        ar[i] = in.nextInt();
        }
   // System.out.print(ar[0] + " ");
	for (int i = 0; i < N; i++) {
		System.out.print(ar[i] + " ");
	    if (ar[i] < K && ar[i + 1] > K) {
	        System.out.print(ar[i] + " " + K + " ");
	    }  
	    }
	}
}