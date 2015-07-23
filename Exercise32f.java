class Exercise32f{
	public static void main(String args[]){
		double A = Double.parseDouble(args[0]);
		int N = Integer.parseInt(args[1]);
		System.out.println(Expression(A, N));
}
    static double Expression(double A, int N) {
    	double k = 1;
		double m = 1;
		for (int i = 1; i <= N; i++) {
            k = - k * A;
            m = k + m;
		}
		return m;
    }
}