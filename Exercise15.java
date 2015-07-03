class Exercise15{
	public static void main(String args[]){
		int N = Integer.parseInt(args[0]);
		int H, M, S;
		H = N / 3600;
		M = (N - H * 3600) / 60;
		S = N - (M * 60 + H * 3600);
		if (N < 86400) {
		    System.out.println(H + " Hours, " + M + " Minutes, " + S + " Secondes");
		} else {
			H = H % 24;
			System.out.println("Another day " + H + " Hours, " + M + " Minutes, " + S + " Secondes");
		}
	}
}