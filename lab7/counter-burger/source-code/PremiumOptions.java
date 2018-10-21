
public enum PremiumOptions implements ItemPriceDecorator{

	SUNNY_SIDE("Sunny Side Up Egg",0),
	MARIANATED_TOAMATOES("Marianated Tomatoes", 2);
	
	private final String optionDesc;
	private final double price;
	
	private PremiumOptions(String optionDesc, double price) {
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

	public static PremiumOptions findByDescription(String option) {
		for(PremiumOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}