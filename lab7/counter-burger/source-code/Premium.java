public class Premium extends LeafDecorator
{
    private static final int DEFAULT_PRICE = 1;
	private PricedListDecorator options =new PricedListDecorator();
    
    
    public Premium( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.50
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		PremiumOptions selection = PremiumOptions.findByDescription(option);
			this.options.addItem(selection);
    		this.price+=DEFAULT_PRICE+selection.getPrice();
    	}
    }
    
    public String getDescription() 
    {
    	return options.getDescription();
    }
    
}