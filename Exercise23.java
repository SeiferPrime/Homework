class Exercise23{
	public static void main(String[] args) {
	    int N = Integer.parseInt(args[0]);
        System.out.println("Number of days = " + year(N));
	}
	static int year(int N) {
		int result = 365;
        if (N > 0) {
        	if ((double)N / 4 == (int)(N / 4)) {
        		result = 366;
        	    if (((double)N / 100 == (int)(N / 100) && ((double)N / 400 != (int)(N / 400)))){
                    result = 365;
        	}
        	}
        }
        return result;
    }
	}