public class Side extends LeafDecorator
{
    private static final Double DEFAULT_PRICE = 3d;
	private PricedListDecorator options =new PricedListDecorator();
    
    public Side( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		SideOptions selection = SideOptions.findByDescription(option);
			this.options.addItem(selection);
    		this.price+=DEFAULT_PRICE+selection.getPrice();
    	}
    }
    
    public String getDescription() 
    {
        return options.getDescription();
    }
    
}
