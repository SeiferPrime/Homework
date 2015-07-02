class Exercise18{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
        if (a > 99 && a < 1000 && (a % 10) > ((a /10) % 10) && ((a /10) % 10) > a /100) {
            System.out.println("The figures of this number is form an increasing sequence");
        }
	}
}