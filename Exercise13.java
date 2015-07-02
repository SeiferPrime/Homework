class Exercise13{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		if (a > 99) {
			System.out.println("The number has more than 2 symbols");
		} else if (a == 0) {
		    System.out.println("Shift = 0");
	    } else if (a < 10) {
			System.out.println("The number has less than 2 symbols");
		} else {
	    System.out.println("Shift = " + (a % 10) + (a / 10));
	}
	}
}