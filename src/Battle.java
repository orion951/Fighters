

public class Battle {

	public static void main(String[] args) {

		String winnerOfTheBattle = declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5),
				"Harald");
		
		System.out.println("Winner is " + winnerOfTheBattle);
		
	}

	
	
	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
		
			String winner = "";
			
			if (firstAttacker == fighter1.name) {
				
				do {
					fighter2.health -= fighter1.damagePerAttack;
					if(fighter2.health <= 0) {
						winner = fighter1.name;
						break;
					}
					
					fighter1.health -= fighter2.damagePerAttack;
					if(fighter1.health <= 0) {
						winner = fighter2.name;
						break;
					}
					System.out.println(fighter1.health + " " + fighter2.health);
				}while(fighter1.health > 0 | fighter2.health > 0);
		
			}else {
				do {
					fighter1.health -= fighter2.damagePerAttack;
					if(fighter1.health <= 0) {
						winner = fighter2.name;
						break;
					}
					
					fighter2.health -= fighter1.damagePerAttack;
					if(fighter2.health <= 0) {
						winner = fighter1.name;
						break;
					}
					System.out.println(fighter1.health + " " + fighter2.health);
				}while(fighter1.health > 0 | fighter2.health > 0);
			}
			return winner;
		}
}
