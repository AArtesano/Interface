
public class ArcadeMachine implements Coinable, Dispensable {
	int coins;
	
	public ArcadeMachine() {
		this.coins = 0;
	}
	
	public void dispense() {
		System.out.println("Ready to PLAY");
		System.out.println("Playing...");
		System.out.println("GAME OVER!\n");
		coins++;
	}
	
	public boolean insertCoin() {
		this.dispense();
		return false;
	}
}
