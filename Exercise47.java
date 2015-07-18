class Exercise47{
	public static void main(String args[]){
    String str = args[0];
    char c = args[1].charAt(0);
    System.out.println(countChars(str, c));
	}
    static int countChars(String str, char c) {
    	int result = 0;
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == c) {
    			result++;
    		}
    	}
    	return result;
    }
}