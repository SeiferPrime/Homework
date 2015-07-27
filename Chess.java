class Chess{
	public static void main(String[] args) {
	    int X1 = Integer.parseInt(args[0]);
		int Y1 = Integer.parseInt(args[1]);
		int X2 = Integer.parseInt(args[2]);
		int Y2 = Integer.parseInt(args[3]);
		color(X1, X2, Y1, Y2);
		Ladya(X1, X2, Y1, Y2);
		Queen(X1, X2, Y1, Y2);
	}

	static void color(int X1, int X2, int Y1, int Y2) {
		if (X1 >= 1 && Y1 >= 1 && X2 >= 1&& Y2 >= 1 && X1 <= 8 && Y1 <= 8 && X2 <= 8 && Y2 <= 8) {
			if ((X1 + Y1) % 2 == (X2 + Y2) % 2) {
				System.out.println("These fields have the same color");
			}
	    }
    }

    static void Ladya(int X1, int X2, int Y1, int Y2) {
    			if (X1 >= 1 && Y1 >= 1 && X2 >= 1&& Y2 >= 1 && X1 <= 8 && Y1 <= 8 && X2 <= 8 && Y2 <= 8) {
			if ((X1 == X2 || Y1 == Y2) && X1 + Y1 != X2 + Y2) {
				System.out.println("Ladya in a single move can move from one field to another");
			}
		}
    }

    static void Queen(int X1, int X2, int Y1, int Y2) {
    	if (X1 >= 1 && Y1 >= 1 && X2 >= 1&& Y2 >= 1 && X1 <= 8 && Y1 <= 8 && X2 <= 8 && Y2 <= 8) {
			if (X1 == X2 && Y1 == Y2) {
				System.out.println("The figure is in the same cell");
			} else if ((X1 + Y1 == X2 + Y2) || (X1 - Y1 == X2 - Y2)) {
				System.out.println("Queen in a single move can move from one field to another");
			} else if (X1 == X2 || Y1 == Y2) {
				System.out.println("Queen in a single move can move from one field to another");
			}
		}
    }
}