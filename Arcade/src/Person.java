
public class Person {
		private int coins;
		public Person(int coins) {
			this.coins = coins;
		}
		
		public void insertCoin(Coinable coinable) {
			System.out.println("Remaining Credits: " + coins);
				
				if(!coinable.insertCoin())
					coins--;
				
				if (coins == 0)
					System.out.println("Remaining Credits: " + coins + "\nInsuficient Credits!");
		}
}
