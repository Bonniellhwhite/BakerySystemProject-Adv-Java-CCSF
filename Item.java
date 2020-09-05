public abstract class Item {
	private int quantity = 1;
	private double price; 
	private String filling;
	private String specialComment;
	private String addOn;
	
	
	
	public Item(int num, double amount, String fill,String scomment, String addoninput) {
		if(num > 1) {
			this.price = num * amount;
		}else {
			this.price = amount;
		}
		this.quantity = num;
		this.specialComment = scomment;
		this.addOn = addoninput;
		this.filling = fill;
	}
	
	public Item(int num, double amount, String fill, String scomment) {
		if(num > 1) {
			this.price = num * amount;
		}else {
			this.price = amount;
		}
		this.quantity = num;
		this.specialComment = scomment;
		this.filling = fill;
	}
	
	public Item(int num, double amount, String fill) {
		if(num > 1) {
			this.price = num * amount;
		}else {
			this.price = amount;
		}
		this.quantity = num;
		this.filling = fill;
	}
	
	public Item(int num, double amount) {
		if(num > 1) {
			this.price = num * amount;
		}else {
			this.price = amount;
		}
		this.quantity = num;
	}
	
	public Item(double amount) {
		this.price = amount;
	}
	
	public Item(String input) {
		this.specialComment = input;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int num) {
		this.quantity = num;
	}
	
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double input) {
		this.price = input;
	}
	
	public String getAddOn() {
			if(this.addOn == null) {
				return "N/A";
			}
			else {
				return this.addOn;
			}
		
	}
	public void setAddOn(String input) {
		this.addOn = input;
	}
	
	public String getSpecialComment() {
		if(this.specialComment == null) {
			return "N/A";
		}
		else {
			return this.specialComment;
		}
	}
	public void setSpecialComment(String input) {
		this.specialComment = input;
	}
	
	public String getFilling() {
		if(this.filling == null) {
			return "N/A";
		}
		else {
			return this.filling;
		}
	}
	public void setFilling(String input){
		this.filling = input;
	}
	
	public String toString() {
		return "Item Price: " + this.price + '\n' +"Item Quantity: " + this.quantity;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			Item otherItem = (Item) obj;
			double otherItemPrice = otherItem.price;
			int otherItemQuantity = otherItem.quantity;
			
			if(this.price == otherItemPrice && this.quantity == otherItemQuantity) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	
	public String getFlavor() {
		return "Item Flavor Specified by Item";
	}
	
	public double finalPrice() {
		return 0.00;
	}
	
	public String getItemType() {
		return "specified by Item";
	}
	
	
}
