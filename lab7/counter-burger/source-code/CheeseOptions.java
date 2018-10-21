
public enum CheeseOptions implements ItemPriceDecorator{

	YELLOW("Yellow American",0),
	SPICY("Spicy Jalapeno Jack",0),
	FETA("Greek Feta",0),
	CHEDDAR("Horseradish Cheddar",0);
	
	private final String optionDesc;
	private final double price;
	
	private CheeseOptions(String optionDesc, double price) {
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

	public static CheeseOptions findByDescription(String option) {
		for(CheeseOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
