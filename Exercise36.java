class Exercise36{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);

    for (int i = 0; N > 0; i++) {
        int k = 0;
        k = N % 10;
        N = N / 10;
        System.out.print(k);
    }
	}
}