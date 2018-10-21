
public enum SideOptions implements ItemPriceDecorator{

	SHOESTRING_FRIES("Shoestring Fries",0);
	
	private final String optionDesc;
	private final double price;
	
	private SideOptions(String optionDesc, double price) {
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

	public static SideOptions findByDescription(String option) {
		for(SideOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
