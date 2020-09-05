/* * Will Complete Later
 * public class BuisnessAccount extends Account{
	private String companyName; 
	public BuisnessAccount(String fname, String lname,String cname) {
		super(fname,lname);
		this.companyName = cname;
	}
	
	public BuisnessAccount(String fname, String lname,String cname, int pnum, boolean ispaid, double amount) {
		super(fname,lname,pnum,ispaid,amount);
		this.companyName = cname;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String cname) {
		this.companyName = cname;
	}
	
	@Override
	public String getAllInfo(){
		if (super.getPaid()) {
			return "Account Name: " + super.getFirstName() + " " + super.lastName 
					+ '\n' + "Phone Number: " + this.phoneNumber
					+ '\n' + "Paid: Yes";
		}
		else {
			return "Account Name: " + super.firstName + " " + super.lastName 
					+ '\n' + "Phone Number: " + super.phoneNumber
					+ '\n' + "Amount Due: " + super.amountdue;
		}
	}
	
	@Override
	public String getOrder(){
		return "Specified with Account type";
	}
	
	@Override
	public String getAccountType() {
		return "Buisness Account";
	}
}

*/
