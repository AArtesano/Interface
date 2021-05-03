
public class TestMachine {
	public static void main(String[] args) {
		
		System.out.println("TECHHEN 8");
		System.out.println("Coins Inserted...\n");
		
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Person person = new Person(5);
		
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
		person.insertCoin(arcadeMachine);
	
	}
}
