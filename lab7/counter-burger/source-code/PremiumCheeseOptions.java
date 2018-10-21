
public enum PremiumCheeseOptions implements ItemPriceDecorator{

	DANISH("Danish Blue Cheese",0),
	MOZARELLA("Fresh Mozarella",0);
	
	private final String optionDesc;
	private final double price;
	
	private PremiumCheeseOptions(String optionDesc, double price) {
		this.optionDesc = optionDesc;
		this.price = price;
	}

	@Override
	public Double getPrice() {
		return this.price;
	}

	@Override
	public String getDescription() {
		return this.optionDesc;
	}

	public static PremiumCheeseOptions findByDescription(String option) {
		for(PremiumCheeseOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
