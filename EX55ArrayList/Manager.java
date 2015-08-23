class Manager extends Employee{
	private double bonus;

	public Manager(int a, String b, String c, double d) {
		super(a, b, c, d);
		bonus = 0;
	}

	public Manager(int a, String b, String c, double d, double e) {
		super(a, b, c, d);
		setbonus(e);
	}

	public double getbonus() {
		return bonus;
	}

	public void setbonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		return super.getSalary() + getbonus();
	}

}