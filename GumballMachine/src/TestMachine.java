
public class TestMachine {
	public static void main (String[] args) {
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(5);
		
		person.insertCoin(gumballMachine, 8);
		person.insertCoin(gumballMachine, 4);
		person.insertCoin(gumballMachine, 5);
		person.insertCoin(gumballMachine, 2);
		person.insertCoin(gumballMachine, 3);
	}
}
