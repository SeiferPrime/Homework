class Exercise35{
	public static void main(String args[]){
		double P = Double.parseDouble(args[0]);
        double n;
        if (P > 0 && P < 25) {
            double S = 1000 * P / 100;
            double K = 100 / S;
        	for (n = 1000; n < 1100; ) {
        		n = n + S;
        	}System.out.println(n);
        	 System.out.println("K = " + Math.ceil(K));
        }
}
}