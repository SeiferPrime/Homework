class Exercise28{
	public static void main(String args[]){
		int D = Integer.parseInt(args[0]);
		int M = Integer.parseInt(args[1]);
		if ((M >= 1 && M <= 12) || (D >= 1 && D <= 31)) {
            if ((M == 1 && D >= 20 && D <= 31) || (M == 2 && D <= 18 && D >= 1)) {
            	System.out.println(D + "." + M + " - Aquarius");
            } else if ((M == 2 && D >= 19 && D <= 29) || (M == 3 && D >= 1 && D <= 20)) {
            	System.out.println(D + "." + M + " - Fishes");
            } else if ((M == 3 && D >= 21 && D <= 31) || (M == 4 && D >= 1 && D <= 19)) {
            	System.out.println(D + "." + M + " - Aries");
            } else if ((M == 4 && D >= 20 && D <= 30) || (M == 5 && D >= 1 && D <= 20)) {
            	System.out.println(D + "." + M + " - Taurus");
            } else if ((M == 5 && D >= 21 && D <= 31) || (M == 6 && D >= 1 && D <= 21)) {
            	System.out.println(D + "." + M + " - Twins");
            } else if ((M == 6 && D >= 22 && D <= 30) || (M == 7 && D >= 1 && D <= 22)) {
            	System.out.println(D + "." + M + " - Cancer");
            } else if ((M == 7 && D >= 23 && D <= 31) || (M == 8 && D >= 1 && D <= 22)) {
            	System.out.println(D + "." + M + " - Lion");
            } else if ((M == 8 && D >= 23 && D <= 30) || (M == 9 && D >= 1 && D <= 22)) {
            	System.out.println(D + "." + M + " - Maiden");
            } else if ((M == 9 && D >= 23 && D <= 31) || (M == 10 && D >= 1 && D <= 22)) {
            	System.out.println(D + "." + M + " - Libra");
            } else if ((M == 10 && D >= 23 && D <= 30) || (M == 11 && D >= 1 && D <= 22)) {
            	System.out.println(D + "." + M + " - Scorpion");
            } else if ((M == 11 && D >= 23 && D <= 30) || (M == 12 && D >= 1 && D <= 21)) {
            	System.out.println(D + "." + M + " - Sagittarius");
            } else if ((M == 12 && D >= 22 && D <= 31) || (M == 1 && D >= 1 && D <= 19)) {
            	System.out.println(D + "." + M + " - Capricorn");
            }
	}
}
}