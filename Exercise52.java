class Exercise52{
	public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    System.out.println(sq(a, b ,c));
	}
    static int sq(int a, int b, int c) {
    	int result;
        int x = 0, y = 0;
    	if (a > b && a > c) {
    		x = a;
            if (b > c) {
                y = b;
            }
            else {y = c;}
    	}
    	else if (b > a && b > c) {
    		x = b;
            if (a > c) {
                y = c;
            }
            else {y = a;}
    	}
        else if (c > a && c > b) {
            x = c;
            if (a > b) {
                y = a;
            }
            else {y = b;}
        }
        result = x * x + y * y;
    	return result;
    }
}