public class Cupcake extends Item { 
	private String buttercream; 
	private String cakeType; 
	
	public Cupcake(int num, double amount, String fill, String bc, String ctype, String scomment,String adon) {
		super(num,amount,fill,scomment, adon);
		this.buttercream = bc;
		this.cakeType = ctype;
	}
	
	public Cupcake(int num, double amount, String fill, String bc, String ctype, String scomment) {
		super(num,amount,fill,scomment);
		this.buttercream = bc;
		this.cakeType = ctype;
	}
	
	public Cupcake(int num, double amount, String fill, String bc, String ctype) {
		super(num,amount, fill);
		this.buttercream = bc;
		this.cakeType = ctype;
	}
	
	public Cupcake(int num, double amount, String bc, String ctype) {
		super(num,amount);
		this.buttercream = bc;
		this.cakeType = ctype;
	}
	
	public String getButtercream() {
		return this.buttercream;
	}
	public void setButtercream(String input) {
		this.buttercream = input;
	}
	
	public String getCakeType() {
		return this.cakeType;
	}
	public void setCakeType(String input) {
		this.cakeType = input;
	}
	
	@Override
	public String toString() {
		return  "Cupcake order Information: " 
				+ '\n' +"Total item price: $" + this.finalPrice() 
				+ '\n' +"Quantity: " + super.getQuantity()
				+ '\n' +"Flavor: " + this.getFlavor()
				+ '\n' +"Add on: " + this.getAddOn()
				+ '\n' +"Special Comments: " + super.getSpecialComment();
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cupcake) {
			Cupcake otherItem = (Cupcake) obj;
			int otherItemQuantity = otherItem.getQuantity();
			String otherItemFilling = otherItem.getFilling();
			String otherItemCakeType = otherItem.getCakeType();
			String otherItemButtercream = otherItem.getButtercream();
			if(super.getQuantity() == otherItemQuantity && 
				super.getFilling().equalsIgnoreCase(otherItemFilling) &&
				this.buttercream.equalsIgnoreCase(otherItemButtercream) &&
				this.cakeType.equalsIgnoreCase(otherItemCakeType)) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	
	@Override
	public String getFlavor() {
		if(super.getFilling().equalsIgnoreCase("N/A")){
			return "This cupcake flavor will be " + this.cakeType + " cake with " + this.buttercream + " buttercream.";
		}
		else {
			return "This cupcake flavor will be " + this.cakeType +
					" cake with " + this.buttercream + 
					" buttercream and " + super.getFilling() + " filling.";
		}
	}
	
	@Override
	public double finalPrice() {
		if(super.getAddOn().equalsIgnoreCase("Sprinkles")) {
			if(super.getQuantity() > 1) {
				return (0.50 * super.getQuantity()) + super.getPrice();
			}
			if(super.getQuantity() == 1) {
				return 0.50 + super.getPrice();
			}
		}
		if(super.getAddOn() == null) {
			return 0.00 + super.getPrice();
		}
		else {
			//Plan to add an exception
			return 0.00 + super.getPrice();
		}
	}
	
	@Override
	public String getItemType() {
		return "This is a cupcake order";
	}
}
