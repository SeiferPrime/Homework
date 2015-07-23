class Exercise37f{
	public static void main(String args[]){
		double N = Double.parseDouble(args[0]);
        System.out.println(Simple(N));
}
    static boolean Simple(double N) {
    	double k = 0;
		boolean q = true;
		if (N > 1) {
            for (int i = 2; i < N; i++) {
            	k = N / i;
            	if (k == (int)k) {
            		q = false;
            		break;
                }
			}
			if (q == true) {
            }
       }
    return q;
    }

}