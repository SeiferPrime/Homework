import java.util.Scanner;
class Exercise50{
    public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    Scanner in = new Scanner(System.in);
    int[] ar = new int[N];
    System.out.println("Enter an array of N integrs");
    for (int i = 0; i < ar.length; i++) {
        ar[i] = in.nextInt();
    }
    System.out.println(prod(ar));
    }
    static int prod(int[] K) {
    int result = 1;
        for (int i = 0; i < K.length; i++) {
            result = result * K[i];
        }
        return result;
    }
}