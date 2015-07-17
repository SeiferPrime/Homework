class Exercise37{
	public static void main(String args[]){
		double N = Double.parseDouble(args[0]);
		boolean q = true;
		if (N > 1) {
		if (N == 2 || N == 3 || N == 5 || N == 7) {
		    q = true;
		    } else if (N % 2 == 0 || N % 3 ==0 || N % 5 ==0 || N % 7 == 0) {
                    q = false;
				} else {
                    q = true;
				} System.out.println(q);
			}
}
}