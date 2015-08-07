public class Customer{
	private int ID;
	private String Name;
	private String SurName;
	private String FatherName;
	private String Adress;
	private Double Sum;
	private long Card;
	private long Bank;

	public int getID() {
    	return ID;
    }
    
    public void setID(int ID) {
    	this.ID = ID;
    }

    public String getName() {
    	return Name;
    }

    public void setName(String Name) {
    	this.Name = Name;
    }

    public String getSurName() {
    	return SurName;
    }

    public void setSurName(String SurName) {
    	this.SurName = SurName;
    }

    public String getFatherName() {
    	return FatherName;
    }

    public void setFatherName(String FatherName) {
    	this.FatherName = FatherName;
    }

    public String getAdress() {
    	return Adress;
    }

    public void setAdress(String Adress) {
    	this.Adress = Adress;
    }

    public double getSum() {
    	return Sum;
    }

    public void setSum(double Sum) {
    	this.Sum = Sum;
    }

    public long getCard() {
    	return Card;
    }

    public void setCard(long Card) {
    	this.Card = Card; 
    }

    public long getBank() {
    	return Bank;
    }

    public void setBank(long Bank) {
    	this.Bank = Bank;
    }

    public void Report() {
        System.out.println("ID : " + getID());
        System.out.println("Name : " + getName());
        System.out.println("Last name : " + getSurName());
        System.out.println("Father's name : " + getFatherName());
        System.out.println("Adress : " + getAdress());
        System.out.println("Total sum : " + getSum());
        System.out.println("Credit card number : " + getCard());
        System.out.println("Bank accaunt : " + getBank());
    }

    public void NewRecord(int a, String b, String c, String d, String e, double f, long g, long h) {
    	setID(a);
        setName(b);
        setSurName(c);
        setFatherName(d);
        setAdress(e);
        setSum(f);
        setCard(g);
        setBank(h);
    }

    public Customer() { }

    public Customer(int a, String b, String c, String d, String e, double f, long g, long h) {
    	setID(a);
        setName(b);
        setSurName(c);
        setFatherName(d);
        setAdress(e);
        setSum(f);
        setCard(g);
        setBank(h);
    }

    public String toString() {
		return "ID : " + ID  + "\nName : " + Name + "\nLast name : " + SurName + "\nFather's name : " + FatherName + "\nAdress : " + Adress
		+ "\nTotal sum : " + Sum + "\nCredit card number : " + Card + "\nBank accaunt : " + Bank;
	}
}
