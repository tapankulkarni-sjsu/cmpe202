import java.util.ArrayList;
import java.util.List;

public class PricedListDecorator implements ItemPriceDecorator{

	private List<ItemPriceDecorator> items = new ArrayList<>();
	
	public void addItem(ItemPriceDecorator item) {
		items.add(item);
	}
	
	@Override
	public String getDescription() {
        String desc = "" ;
        for (ItemPriceDecorator item:items)
        {
        	desc += " + " + item.getDescription();
        }        
        desc=desc.replaceFirst(" \\+ ", "");
        return desc ;
	}
	
	@Override
	public Double getPrice() {
		double total = 0;
        for (ItemPriceDecorator item:items)
        {
        	total += item.getPrice();
        }        
		return total;
	}

}
