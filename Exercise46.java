import java.util.Scanner;
class Exercise46{
    public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    Scanner in = new Scanner(System.in);
    int[] ar = new int[N];
    System.out.println("Enter an array of N integrs");
    for (int i = 0; i < ar.length; i++) {
        ar[i] = in.nextInt();
        }
    System.out.print(ar[0] + " ");
	for (int i = 1; i < N; i++) {
	    if (ar[i] != ar[i - 1]) {
	        System.out.print(ar[i] + " ");
	    }  
	    }
	}
}