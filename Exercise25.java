class Exercise25{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    int M = Integer.parseInt(args[1]);
    String s = "";
    String s1 = "";
    if (N >= 6 && N <= 14 && M >= 1 && M <= 4) {
        switch (N) {
            case 6 : s1 = "Six "; break;
            case 7 : s1 = "Seven "; break;
            case 8 : s1 = "Eight "; break;
            case 9 : s1 = "Nine "; break;
            case 10 : s1 = "Ten "; break;
            case 11 : s1 = "Jack "; break;
            case 12 : s1 = "Queen "; break;
            case 13 : s1 = "King "; break;
            case 14 : s1 = "Ace "; break;
        }
        switch (M) {
            case 1 : s = "Spades"; break;
            case 2 : s = "Clubs"; break;
            case 3 : s = "Diamonds"; break;
            case 4 : s = "Hearts"; break;
        }
    }
    System.out.println(s1 + s);
	}
}