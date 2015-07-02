class Exercise16{
	public static void main(String args[]){
		int K = Integer.parseInt(args[0]);
		if (K >= 1 && K <= 365) {
            K = ((K + 1) % 7) + 1;
            System.out.println("Day " + K);
        }
	}
}