class Exercise34{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
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