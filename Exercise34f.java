class Exercise34f{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    FKN(N);
	}

    static void FKN(int N) {
    int n = 1;
    int k = 0;
    int a = 1;
    if (N > 1) {
        for (int i = 1; i <= N; i++) {
            a = n + k;
            n = k;
            k = a;
            System.out.println(a);
        }
    } 
    }
}