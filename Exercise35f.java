class Exercise35f{
	public static void main(String args[]){
		double P = 18; //Double.parseDouble(args[0]);
    Vklad(P);
}
    static void Vklad(double P) {
        double n = 0;
        double K = 0;
        if (P > 0 && P < 25) {
            double S = 1000 * P / 100;
            K = 100 / S;
            for (n = 1000; n < 1100; ) {
                n = n + S;
            }System.out.println(n);
            System.out.println("K = " + Math.ceil(K));
        }
    }

}