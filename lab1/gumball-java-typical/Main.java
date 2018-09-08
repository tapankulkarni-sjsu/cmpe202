import java.util.TreeSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		executegumballMachineCase();
		executeGumballMachineCase2();
		executeGumballMachineCase3();
	}

	private static void executegumballMachineCase() {
		System.out.println("----Case 1 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		GumballMachine gumballMachineCase = new GumballMachine(5, 25, acceptableCoins );

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 20 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);
		System.out.println("----Case 1 End----");
	}
	
	private static void executeGumballMachineCase2() {
		System.out.println("----Case 2 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		GumballMachine gumballMachineCase = new GumballMachine(5, 50, acceptableCoins );

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 20 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 50 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);
		System.out.println("----Case 2 End----");
	}
	
	private static void executeGumballMachineCase3() {
		System.out.println("----Case 3 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		acceptableCoins.add(10);
		acceptableCoins.add(5);
		GumballMachine gumballMachineCase = new GumballMachine(5, 50, acceptableCoins );

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 25 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);

		gumballMachineCase.insertCoin( 10 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 5 );
		gumballMachineCase.insertCoin( 10 );
		gumballMachineCase.turnCrank();
		gumballMachineCase.insertCoin( 50 );
		gumballMachineCase.turnCrank();

		System.out.println(gumballMachineCase);
		System.out.println("----Case 3 End----");
	}
}
