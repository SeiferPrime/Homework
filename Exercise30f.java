class Exercise30f{
	static int ProdBetween(int A, int B) {
	int k = 1;
	if (A < B) {
		for (int i = A; i <= B; i++) {	
			 k = k * i;
		}
	} else if (A > B) {
		for (int i = B; i <= A; i++) {	
			k = k * i;
		}	
	} else {
		k = 0;
	}
    return k;
}

	public static void main(String args[]){
	int A = Integer.parseInt(args[0]);
	int B = Integer.parseInt(args[1]);
    System.out.println(ProdBetween(A, B));    
}
}