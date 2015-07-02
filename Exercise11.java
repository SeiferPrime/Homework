class Exercise11{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int Tens, Ones;
		if (a > 99) {
			System.out.println("The number has more than 2 symbols");
		} else if (a == 0) {
		    System.out.println("Sum = 0");
	        System.out.println("Multiplication = 0");
	    } else if (a < 10) {
			System.out.println("The number has less than 2 symbols");
	    } else {
	    Tens = a / 10;
	    Ones = a % 10;
	    System.out.println("Sum = " + (Tens + Ones));
	    System.out.println("Multiplication = " + (Tens * Ones));
	}
	}
}