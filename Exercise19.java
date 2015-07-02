class Exercise19{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
        if (a > 999 && a < 10000 && (a % 10) == (a / 1000) && ((a / 10) % 10) == (a / 100) % 10) {
            System.out.println("This number reads the same from left to right and right to left");
        }
	}
}