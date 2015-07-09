class Exercise29{
	public static void main(String args[]){
		int A = Integer.parseInt(args[0]);
		int B = Integer.parseInt(args[1]);
		int k = 0;
		if (A < B) {
			for (int i = A; i <= B; i++) {	
				k = k + i;
			}
			System.out.println(k);
	    }
}
}