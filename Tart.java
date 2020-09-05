public class Tart extends Item { 
	public Tart(int num, double amount, String fill, String scomment, String adon) {
		super(num,amount,fill,scomment,adon);
	}
	public Tart(int num, double amount, String fill, String scomment) {
		super(num,amount,fill,scomment);
	}
	public Tart(int num,double amount, String fill) {
		super(num,amount,fill);
	}
	
	@Override
	public String toString() {
		return  "Tart order Information: " 
				+ '\n' +"Total item price: $" + this.finalPrice() 
				+ '\n' +"Quantity: " + super.getQuantity()
				+ '\n' +"Flavor: " + this.getFlavor()
				+ '\n' +"Add on: " + this.getAddOn()
				+ '\n' +"Special Comments: " + super.getSpecialComment();		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Tart) {
			Tart otherItem = (Tart) obj;
			String otherItemFilling = otherItem.getFilling();
			int otherItemQuanitity = otherItem.getQuantity();
			double otherItemPrice = otherItem.getPrice();
			if(super.getPrice() == otherItemPrice &&
				super.getQuantity() == otherItemQuanitity &&
				super.getFilling().equalsIgnoreCase(otherItemFilling)) {
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
		if(super.getFilling().equalsIgnoreCase("Chocolate") || super.getFilling().equalsIgnoreCase("Lemon Curd") || super.getFilling().equalsIgnoreCase("Frangipane")){
			return "This tart will have a sucree shell and " + super.getFilling() + " Filling.";
		}
		else {
			return "This tart will have a pastry shell and " + super.getFilling() + " Filling.";
		}
	}
	
	@Override
	public double finalPrice() {
		if(super.getAddOn().equalsIgnoreCase("Glitter")) {
			if(super.getQuantity() > 1) {
				return (0.50 * super.getQuantity()) + super.getPrice();
			}
			if(super.getQuantity() == 1) {
				return 0.50 + super.getPrice();
			}
		}
		if(super.getAddOn() == null) {
			return super.getPrice();
		}
		else {
			//will probably throw exception or something
			return 0.00 + super.getPrice();
		}
	}
	
	@Override
	public String getItemType() {
		return "This is a tart order";
	}
}
