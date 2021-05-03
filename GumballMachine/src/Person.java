
public class Person {
	private int coins, costs;
	
		public Person(int coins) {
			this.setCoins(coins);
			this.costs = 3;
		}
	
		public void insertCoin(Coinable coinable, int coins) {
			System.out.println("Coins Inserted is " + coins);
		
				if(coins > 2) {
			
					if(!coinable.insertCoin()) {
						System.out.println("Coins Refunded " + coins);
					}
		
					else {
						coins = coins - costs;
						System.out.println("Refunded " + coins + " coins\n");
					}
				}
				
				else {
					System.out.println("Requires 3 coins\n" + "Coins have been returned\n");
				}
		}
	
		public int getCoins() {
			return coins;
		}
		
		public void setCoins(int coins) {
			this.coins = coins;
		}
}
