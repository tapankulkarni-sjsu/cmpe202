

import java.util.Random;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int value) {
		if(!gumballMachine.isPurchasaeble()){
			gumballMachine.attemptAddValue(value);
		}else{
			System.out.println("You can't insert another coin");
		}
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		if(gumballMachine.getTotalInsertedValue()==0){
			gumballMachine.setState(gumballMachine.getNoCoinState());
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		if(gumballMachine.isPurchasaeble()){
			gumballMachine.setState(gumballMachine.getSoldState());
		}else{
			System.out.println("Please enter more coins of value : "+(gumballMachine.getCost()-gumballMachine.getTotalInsertedValue()));
		}
	}

        public void dispense() {
            System.out.println("No gumball dispensed");
        }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
