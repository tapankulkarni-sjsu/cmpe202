
public enum SauceOptions implements ItemPriceDecorator{

	HABENARO_SALSA("Habenaro Salsa",0),
	MAYO("Mayonnaise",0),
	THAI_PEANUT_SAUCE("Thai Peanut Sauce",0),
	APRICOT("Appricot Sauce",0);
	
	private final String optionDesc;
	private final double price;
	
	private SauceOptions(String optionDesc, double price) {
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

	public static SauceOptions findByDescription(String option) {
		for(SauceOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
