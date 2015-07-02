class Exercise17{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
        if (a > 99 && a < 1000 && (a % 2) != 0) {
            System.out.println("This three-digit number is odd");
        }
	}
}