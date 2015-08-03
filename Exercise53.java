class Customer{
	private String[] arr = {"2020", "Ivanov", "Konstya", "Albertovi4", "s. Gadukino, do vostrebovaniya", "100500", "1020304050", "5040302010"};
    
    public void setID(String arr[]) {
    	this.arr[0] = arr[0];
    }
    public String getID() {
    	return arr[0];
    }
    public void setName(String arr[]) {
    	this.arr[1] = arr[1];
    }
    public String getName() {
    	return arr[1];
    }
    public void setSurname(String arr[]) {
    	this.arr[2] = arr[2];
    }
    public String getSurname() {
    	return arr[2];
    }
    public void setFatherName(String arr[]) {
    	this.arr[3] =arr[3];
    }
    public String getFatherName() {
    	return arr[3];
    }
    public void setAdress(String arr[]) {
    	this.arr[4] = arr[4];
    }
    public String getAdress() {
    	return arr[4];
    }
    public void setSum(String arr[]) {
    	this.arr[5] = arr[5];
    }
    public String getSum() {
    	return arr[5];
    }
    public void setCard(String arr[]) {
    	this.arr[6] = arr[6]; 
    }
    public String getCard() {
    	return arr[6];
    }
    public void setBank(String arr[]) {
    	this.arr[7] = arr[7];
    }
    public String getBank() {
    	return arr[7];
    }
    void doit() {
    	String s = "";
    	for (int i = 0; i <= 7; i++) {
    	    s = s + arr[i];
    	}
    	System.out.println(s);
    }
    static void doit1(String getCard) {
    	System.out.println("Yeah!!!");
    }
    
}

class Exercise53{
	public static void main(String[] args) {
        Report();
	}

    static void Report() {
        Customer info = new Customer();
        System.out.println(info.getID());
        System.out.println(info.getName());
        System.out.println(info.getSurname());
        System.out.println(info.getFatherName());
        System.out.println(info.getAdress());
        System.out.println(info.getSum());
        System.out.println(info.getCard());
        System.out.println(info.getBank());
    }
}