import java.util.Set;

public class GumballMachine
{

    private int num_gumballs;
    private int cost;
    private Set<Integer> acceptableCoins;
    private int totalInsertedValue;

    public GumballMachine( int size , int cost, Set<Integer> acceptableCoins)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost;
        this.acceptableCoins = acceptableCoins;
    }

    public void insertCoin(int coin)
    {
    	System.out.println("Coin inserted of value : "+ coin);
        if ( acceptableCoins.contains(coin) ){
        	this.totalInsertedValue += coin;
        }else{ //No way to eject coins
            System.out.println("Please insert a coin of one following values :" + acceptableCoins.toString());
    	}
    }
    
    public void turnCrank()
    {
    	System.out.println("Crank turned!!!");
    	if ( isPurchasable() )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.totalInsertedValue = 0;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println("Cost of a gumball is : "+ cost + ". Please inset more coins with total value : "+ (this.cost-this.totalInsertedValue));
    	}        
    }

	private boolean isPurchasable() {
		return this.totalInsertedValue >= cost; // No way to eject coins. So additional coins will be used for single gumball. 
	}

	@Override
	public String toString() {
		return "GumballMachine [num_gumballs=" + num_gumballs + ", cost=" + cost + ", acceptableCoins="
				+ acceptableCoins + ", totalInsertedValue=" + totalInsertedValue + "]";
	}
	
}
