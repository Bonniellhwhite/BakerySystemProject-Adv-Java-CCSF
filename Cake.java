public class Cake extends Item {
	private String buttercream;
	private String cakeType;
	private String inscription;
	private int size; 
	
	public Cake(int num, double amount, String fill, String bc, String ctype, int inches,String input, String scomment,String adon) {
		super(num,amount,fill,scomment, adon);
		this.buttercream = bc;
		this.cakeType = ctype;
		this.size = inches;
		this.inscription = input;
	}
	
	public Cake(int num, double amount, String fill, String bc, String ctype,int inches,String input, String scomment) {
		super(num,amount,fill,scomment);
		this.buttercream = bc;
		this.cakeType = ctype;
		this.size = inches;
		this.inscription = input;
	}
	
	public Cake(int num, double amount, String fill, String bc, String ctype, int inches, String input) {
		super(num,amount, fill);
		this.buttercream = bc;
		this.cakeType = ctype;
		this.size = inches;
		this.inscription = input;
	}
	
	public Cake(int num, double amount, String bc, String ctype, int inches, String input) {
		super(num,amount);
		this.buttercream = bc;
		this.cakeType = ctype;
		this.size = inches;
		this.inscription = input;
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
	public String getInscription() {
		if(this.inscription == null) {
			return "N/A";
		}else {
			return this.inscription;
		}
		 
	}
	public void setInscription(String input) {
		this.inscription = input;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize(String input) {
		this.buttercream = input;
	}
	
	
	@Override
	public String toString() {
		return  "Cake order Information: " 
				+ '\n' +"Total item price: $" + this.finalPrice() 
				+ '\n' +"Quantity: " + super.getQuantity()
				+ '\n' +"Size: " + this.size + " inch"
				+ '\n' +"Flavor: " + this.getFlavor()
				+ '\n' +"Inscription: " + this.getInscription()
				+ '\n' +"Add on: " + super.getAddOn()
				+ '\n' +"Special Comments: " + super.getSpecialComment();
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cake) {
			Cake otherItem = (Cake) obj;
			int otherItemQuantity = otherItem.getQuantity();
			String otherItemFilling = otherItem.getFilling();
			String otherItemCakeType = otherItem.getCakeType();
			String otherItemButtercream = otherItem.getButtercream();
			String otherItemInscription = otherItem.getInscription();
			int otherItemSize = otherItem.getSize();
			if(super.getQuantity() == otherItemQuantity && 
				super.getFilling().equalsIgnoreCase(otherItemFilling) &&
				this.buttercream.equalsIgnoreCase(otherItemButtercream) &&
				this.cakeType.equalsIgnoreCase(otherItemCakeType)&&
				this.inscription.equalsIgnoreCase(otherItemInscription) &&
				this.size == otherItemSize) {
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
			return "This cake will be a " + this.cakeType + " cake with " + this.buttercream + " buttercream.";
		}
		else {
			return "This cake will be " + this.cakeType +
					" cake with " + this.buttercream + 
					" buttercream and " + super.getFilling() + " filling.";
		}
	}
	
	@Override
	public double finalPrice() {
		if(super.getAddOn().equalsIgnoreCase("Sprinkles") || super.getAddOn().equalsIgnoreCase("Glitter")) {
			return 1 + super.getPrice();
		}
		if(super.getAddOn().equalsIgnoreCase("Themed")) {
			return 10 + super.getPrice();
		}
		if(super.getAddOn() == null) {
			return super.getPrice();
		}
		else {
			//Plan to add an exception
			return 0;
		}
	}
	
	@Override
	public String getItemType() {
		return "This is a cake order";
	}
}
