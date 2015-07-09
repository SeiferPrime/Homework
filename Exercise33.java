class Exercise33{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    double a = 1;
    if (N > 0) {
        for (int i = 1; i<= N; i++) {
            a = a * i;
        }
        System.out.println("N! = " + a);
    } else if (N == 1) {
        System.out.println("N! = 1");
    }
	}
}