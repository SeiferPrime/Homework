class Exercise48{
	public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    System.out.println(smallest(a, b ,c));
	}
    static int smallest(int a, int b, int c) {
    	int result = 0;
    	if (a < b && a < c) {
    		result = a;
    	}
    	else if (b < a && b < c) {
    		result = b;
    	}
        else if (c < a && c < b) {
            result = c;
        }
    	return result;
    }
}