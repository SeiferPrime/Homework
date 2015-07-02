class Exercise14{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int Tens, Ones, Hundreds;
		if (a > 999) {
			System.out.println("The number has more than 3 symbols");
		} else if (a == 0) {
		    System.out.println("Sum = 0");
	        System.out.println("Multiplication = 0");
	    } else if (a < 100) {
			System.out.println("The number has less than 3 symbols");
		} else {
	    Hundreds = a / 100;
	    Tens = (a / 10) % 10;
	    Ones = a % 10;
	    System.out.println("Sum = " + (Hundreds + Tens + Ones));
	    System.out.println("Multiplication = " + Hundreds * Tens * Ones);
	}
	}
}