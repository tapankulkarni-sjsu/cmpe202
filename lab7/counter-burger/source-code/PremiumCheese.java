public class PremiumCheese extends LeafDecorator
{
    private static final Double DEFAULT_PRICE = 1.50d;
	private PricedListDecorator options =new PricedListDecorator();
    
    public PremiumCheese( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		PremiumCheeseOptions selection = PremiumCheeseOptions.findByDescription(option);
			this.options.addItem(selection);
    		this.price+=DEFAULT_PRICE+selection.getPrice();
    	}
    }
    
    public String getDescription() 
    {
        return options.getDescription();
    }
    
}
