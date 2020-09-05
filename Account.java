/*    
 * 
 * Will Complete Later
public abstract class Account {
	
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private boolean paid = false;
	private double amountdue;
	
	public Account(String fname, String lname, int pnum, boolean ispaid, double amount) {
		this.firstName = fname;
		this.lastName = lname;
		this.phoneNumber = pnum;
		this.paid = ispaid; 
		this.amountdue = amount;
	}
	public Account(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(int pnum) {
		this.phoneNumber = pnum;
	}

	public boolean getPaid() {
		return this.paid;
	}
	public void setpaid(boolean ispaid){
		this.paid = ispaid;
	}
	
	public double getAmountDue() {
		return this.amountdue;
	}
	public void setAmountDue(double amount) {
		this.amountdue = amount;
	}
	
	public String toString() {
		return "Account Name: " + this.firstName + " " + this.lastName + '\n' + "Phone Number: " + this.phoneNumber;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account otherAccount = (Account) obj;
			String otherfirstName = otherAccount.firstName;
			String otherlastName = otherAccount.lastName;
			if(firstName.equalsIgnoreCase(otherfirstName) && lastName.equalsIgnoreCase(otherlastName)) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
		
	}
	
	public String getAllInfo(){
		if (this.paid) {
			return "Account Name: " + this.firstName + " " + this.lastName 
					+ '\n' + "Phone Number: " + this.phoneNumber
					+ '\n' + "Paid: Yes";
		}
		else {
			return "Account Name: " + this.firstName + " " + this.lastName 
					+ '\n' + "Phone Number: " + this.phoneNumber
					+ '\n' + "Amount Due: " + this.amountdue;
		}
	}
	
	public String getOrder(){
		return "Specified with Account type";
	}
	
	public String getAccountType() {
		return "Specified with Account type";
	}
}

*/

	

