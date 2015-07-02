class Exercise18a{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
        if (a > 99 && a < 1000 && (a % 10) == (((a / 10) % 10) + 1) && ((a / 10) % 10) == (a / 100) +1) {
            System.out.println("The figures of this number is form an increasing arithmetic sequence");
        }
	}
}