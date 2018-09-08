import java.util.TreeSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		executeGumballMachineCase1();
		executeGumballMachineCase2();
		executeGumballMachineCase3();
	}

	private static void executeGumballMachineCase1() {
		System.out.println("----Case 1 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		GumballMachine gumballMachineCase1 = new GumballMachine(5, 25, acceptableCoins );

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 20 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);
		System.out.println("----Case 1 End----");
	}
	
	private static void executeGumballMachineCase2() {
		System.out.println("----Case 2 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		GumballMachine gumballMachineCase1 = new GumballMachine(5, 50, acceptableCoins );

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 20 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 50 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);
		System.out.println("----Case 2 End----");
	}
	
	private static void executeGumballMachineCase3() {
		System.out.println("----Case 3 Start----");
		Set<Integer> acceptableCoins = new TreeSet<>();
		acceptableCoins.add(25);
		acceptableCoins.add(10);
		acceptableCoins.add(5);
		GumballMachine gumballMachineCase1 = new GumballMachine(5, 50, acceptableCoins );

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 25 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);

		gumballMachineCase1.insertCoin( 10 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 5 );
		gumballMachineCase1.insertCoin( 10 );
		gumballMachineCase1.turnCrank();
		gumballMachineCase1.insertCoin( 50 );
		gumballMachineCase1.turnCrank();

		System.out.println(gumballMachineCase1);
		System.out.println("----Case 3 End----");
	}
}
