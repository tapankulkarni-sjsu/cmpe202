public class Bun extends LeafDecorator
{
    private PricedListDecorator options =new PricedListDecorator();
    
    public Bun( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		BunOptions selection = BunOptions.findByDescription(option);
			this.options.addItem(selection);
			this.price+=selection.getPrice();
    	}
    }
    
    public String getDescription() 
    {
        return options.getDescription();
    }
    
}
