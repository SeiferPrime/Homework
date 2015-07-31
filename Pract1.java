class Pract1{
	public static void main(String[] args) {
	int N = Integer.parseInt(args[0]);
    romb(N);
	}

	static void stars(int N) {
		for (int i = 0; i < N; i++) {
			System.out.print("*");
		}
	}

		static void spaces(int N) {
		for (int i = 0; i < N; i++) {
			System.out.print(" ");
		}
	}

    static void romb(int N) {

        for (int i = 1; i <= N; i++) {
        	spaces(N - i);
        	spaces(N);
        	stars(i);
        	stars(i);
        	System.out.println();
        }
        for (int i = N; i >= 1; i--) {
        	spaces(N - i);
        	spaces(N);
        	stars(i);
        	stars(i);
        	System.out.println();
        }
    }
}