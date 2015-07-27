class Exercise27{
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
        System.out.println("Year of " + Year(N));
	}
	static String Year(int N) {
		String s = "";
        String s1 = "";
	    String[] arc = {"Pig", "Rat", "Bull", "Tiger", "Hare", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Hen", "Dog"};
	    String[] arpc = {"Black ", "Green " , "Red ", "Yellow ", "White "};
        if (N >= 0) {
            for (int i = 0; i < 12; i++) {
            	if ((9 + N) % 12 == i) {
                    s = arc[i];
            	}
            }
            for (int j = 0; j < 5; j++) {
            	if ((2 + N) % 5 == j) {
            		s1 = arpc[j];
            	}
            }
        }
        return s1 + s;
	}
}