import java.util.ArrayList;
import java.util.List;

public class BakingSystemDriver {
	public static void main(String[] args) {
		Tart torder1 = new Tart(4,5,"chocolate");
		Tart torder2 = new Tart(2,5,"Lemon Curd","Will pick up in the afternoon","Glitter");
		Tart torder3 = new Tart(4,5,"Peach");
		Cupcake ccorder1 = new Cupcake(12,4.50,"Cream","Strawberry","Chocolate","Cupcake Roses","Sprinkles");
		Cupcake ccorder2 = new Cupcake(6,4.50,"Vanilla","Vanilla");
		Cake corder1 = new Cake(1,25,"Lemon Curd", "Lemon", "Almond",6,"Happy Birthday Ben","Basic theme, nothing too much","Sprinkles");
		Cake corder2 = new Cake(1,40,"Chocolate","Chocolate","Vanilla",12,"16!","For a 16th birthday,make it beach themed","Themed");
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(torder1);
		itemList.add(torder2);
		itemList.add(torder3);
		itemList.add(ccorder1);
		itemList.add(ccorder2);
		itemList.add(corder1);
		itemList.add(corder2);	
		System.out.println("Item List Size: "+itemList.size());
		
		// Testing Tart items 
		System.out.println("Order 1 tart test-------------------------------------------------");
		System.out.println(torder1.getItemType());
		System.out.println("Testing toString Method" + '\n' + torder1.toString());
		System.out.println("Should equal true: " + torder1.equals(torder1));
		System.out.println("Should equal false: " + torder1.equals(torder2));
		System.out.println("Should say sucree with chocolate filling: "+ '\n' + torder1.getFlavor());
		System.out.println("Should equal $20: $" + torder1.finalPrice());
		System.out.println("Should say it is a Tart item: " + torder1.getItemType());
		System.out.println("<Order 2 tart test------------------------------------------------->");
		System.out.println(torder2.toString());
		System.out.println("Should equal true: " + torder2.equals(torder2));
		System.out.println("<Order 3 tart test------------------------------------------------->");
		System.out.println(torder3.toString());
		System.out.println("Flavor should be pastry with peach");
		System.out.println("");
		
		// Testing Cupcake items 
		System.out.println("Order 1 Cupcake test-------------------------------------------------");
		System.out.println(ccorder1.getItemType());
		System.out.println("Testing toString Method" + '\n' + ccorder1.toString());
		System.out.println("Should equal true: " + ccorder1.equals(ccorder1));
		System.out.println("Should equal false: " + ccorder1.equals(ccorder2));
		System.out.println("Should say cream filling, chocolate cake, strawberry buttercream: " + '\n' + ccorder1.getFlavor());
		System.out.println("Should equal $60: $" + ccorder1.finalPrice());
		System.out.println("Should say it is a Cupcake item: " + ccorder1.getItemType());
		System.out.println("<Order 2 Cupcake test------------------------------------------------->");
		System.out.println(ccorder2.toString());
		System.out.println("Should equal true: " + ccorder2.equals(ccorder2));
		System.out.println("");
		// Testing Cake items 
		System.out.println("Order 1 Cake test-------------------------------------------------");
		System.out.println(corder1.getItemType());
		System.out.println("Testing toString Method" + '\n' + corder1.toString());
		System.out.println("Should equal true: " + corder1.equals(corder1));
		System.out.println("Should equal false: " + corder1.equals(corder2));
		System.out.println("Should say lemon curd filling, lemon buttercream, Almond Cake: " + '\n' + corder1.getFlavor());
		System.out.println("Should equal $26: $" + corder1.finalPrice());
		System.out.println("Should say it is a Cake item: " + corder1.getItemType());
		System.out.println("<Order 2 Cake test------------------------------------------------->");
		System.out.println(torder2.toString());
		System.out.println("Testing toString Method" + '\n' + corder2.toString());
		System.out.println("Should equal true: " + corder2.equals(corder2));
		System.out.println("Should equal false: " + corder2.equals(corder1));
		System.out.println("Should Chocolate filling, chocolate buttercream, vanilla cake: " + '\n' + corder2.getFlavor());
		System.out.println("Should equal $50: $" + corder2.finalPrice());
		System.out.println("Should say it is a Cake item: " + corder2.getItemType());
	}
}
