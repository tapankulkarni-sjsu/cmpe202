public class Burger extends LeafDecorator
{
    private PricedListDecorator options =new PricedListDecorator();
    
    public Burger( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
    	for(String option:options) {
    		BurgerOptions selection = BurgerOptions.findByDescription(option);
			this.options.addItem(selection);
			this.price += selection.getPrice();
    	}
    }
    
    public String getDescription() 
    {
        return options.getDescription();
    }
    
}
