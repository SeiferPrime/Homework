class Exercise10{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int Tens, Ones;
		if (a > 99) {
			System.out.println("The number has more than 2 symbols");
		} else {
	    Tens = a / 10;
	    Ones = a % 10;
	    System.out.println("Left part = " + Tens);
	    System.out.println("Right part = " + Ones);
	}
	}
}