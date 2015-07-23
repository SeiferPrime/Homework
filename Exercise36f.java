class Exercise36f{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    Revers(N);
    }
    static void Revers(int N) {
    for (int i = 0; N > 0; i++) {
        int k = 0;
        k = N % 10;
        N = N / 10;
        System.out.print(k);
    }
	}
}