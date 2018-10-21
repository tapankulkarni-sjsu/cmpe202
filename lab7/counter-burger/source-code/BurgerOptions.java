
public enum BurgerOptions implements ItemPriceDecorator{

	lbs13("1/3lb.",9),
	lbs12("1/2lb.",12),
	lb1("1lb.",18),
	ORGANIC_BISON("Organic Bison",4),
	HARMONE_FREE_BEEF("Harmon & Antibiotic Free Beef", 0),
	ON_A_BUN("On A Bun",0),
	IN_A_BOWL("In A Bowl",1);
	
	private final String optionDesc;
	private final double price;
	
	private BurgerOptions(String optionDesc, double price) {
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

	public static BurgerOptions findByDescription(String option) {
		for(BurgerOptions item:values()) {
			if(item.optionDesc.equals(option)) {
				return item;
			}
		}
		return null;
	}

	
}
