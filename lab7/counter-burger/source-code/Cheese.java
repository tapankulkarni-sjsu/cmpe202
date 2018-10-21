public class Cheese extends LeafDecorator
{
    private static final Double DEFAULT_PRICE = 1d;
	private PricedListDecorator options =new PricedListDecorator();
    
    public Cheese( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		CheeseOptions selection = CheeseOptions.findByDescription(option);
			this.options.addItem(selection);
    		this.price+=DEFAULT_PRICE+selection.getPrice();
    	}
    	if(this.price>=DEFAULT_PRICE) {//Adjusting for 1 free
    		this.price-=DEFAULT_PRICE;
    	}
    }
    
    public String getDescription() 
    {
        return options.getDescription();
    }
    
}
