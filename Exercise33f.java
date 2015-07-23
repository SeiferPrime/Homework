class Exercise33{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    System.out.println("N! = " + Factorial(N));
	}
    static int Factorial(int N) {
        double a = 1;
        if (N > 1) {
            for (int i = 1; i<= N; i++) {
            a = a * i;
            }
        } else if (N == 1 || N == 0) {
            a = 1;
    }
    return (int)a;
    }
}