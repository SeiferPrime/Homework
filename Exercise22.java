class Exercise22{
	public static void main(String args[]){
		int X1 = Integer.parseInt(args[0]);
		int Y1 = Integer.parseInt(args[1]);
		int X2 = Integer.parseInt(args[2]);
		int Y2 = Integer.parseInt(args[3]);
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