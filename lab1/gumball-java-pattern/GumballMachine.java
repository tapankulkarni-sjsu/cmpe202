import java.util.Set;

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	private int cost;
	private Set<Integer> acceptableCoins;
    private int totalInsertedValue;
 
	public GumballMachine(int numberGumballs, int cost, Set<Integer> acceptableCoins) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
 			this.cost = cost;
			state = noCoinState;
			this.acceptableCoins = acceptableCoins;
		} 
	}
 
	public void insertCoin(int value) {
		state.insertCoin(value);
	}
 
	public void ejectCoin() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

        public State getState() {
            return state;
        }
    
        public State getSoldOutState() {
            return soldOutState;
        }
    
        public State getNoCoinState() {
            return noCoinState;
        }
    
        public State getHasCoinState() {
            return hasCoinState;
        }
    
        public State getSoldState() {
            return soldState;
        }
 
	public int getCost() {
		return cost;
	}

	public Set<Integer> getAcceptableCoins() {
		return acceptableCoins;
	}

	public boolean attemptAddValue(int value){
		if(acceptableCoins.contains(value)){
			totalInsertedValue+=value;
			return true;
		}else{
			System.out.println("Please enter coins of value : "+acceptableCoins.toString());
			return false;
		}
	}	
	
	public int getTotalInsertedValue() {
		return totalInsertedValue;
	}

	public boolean isPurchasaeble(){
		return totalInsertedValue>=cost;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
