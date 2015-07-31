class Exercise8oop {
	public static void main	(String[] args) {
	    Toplivo rashod = new Toplivo();
	    System.out.println("Gas consumption for 100 km = " + Math.rint(100.0 * rashod.K) / 100.0);
	    System.out.println("Gas cost for 1km = " + Math.rint(100.0 * rashod.Cost1) / 100.0);
	}
}