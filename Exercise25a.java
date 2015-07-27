class Exercise25a{
	public static void main(String args[]){
    int N = Integer.parseInt(args[0]);
    int M = Integer.parseInt(args[1]);
    System.out.println(cards(N, M));
}
    static String cards(int N, int M){
    String s = "";
    String s1 = "";
    String[] arN = {"Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Jack ", "Queen ", "King ", "Ace "}; 
    String[] arM = {"Spades", "Clubs", "Diamonds", "Hearts"};
    if (N >= 6 && N <= 14 && M >= 1 && M <= 4) {
        for (int i = 0; i <= 9; i++) {
            if (N == i) {
                s = arN[i];
            }
        }
        for (int j = 0; j <= 4; j++) {
            if (M == j) {
                s1 = arM[j];
            }  
        }
    }
    return s + s1;
}
}