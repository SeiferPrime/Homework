class Exercise37{
	public static void main(String args[]){
		double N = Double.parseDouble(args[0]);
		double k = 0;
		boolean q = true;
		if (N > 1) {
            for (int i = 2; i < N; i++) {
            	k = N / i;
            	if (k == (int)k) {
            		System.out.println("False");
            		q = false;
            		break;
            }
			}
			if (q == true) {
            	System.out.println("True");
            }
}
}
}