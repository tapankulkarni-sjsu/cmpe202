
public enum BunOptions implements ItemPriceDecorator{

	GLUTEN_FREE("Gluten Free Bun",1),
	ENGLISH_MUFFIN("English Muffin",0);
	
	private final String optionDesc;
	private final double price;
	
	private BunOptions(String optionDesc, double price) {
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

	public static BunOptions findByDescription(String option) {
		for(BunOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
