package blackJack;

public class GameRules {
	
	
	public int GamePlayed(dealer x, player y) {
		if (x.valueOfPlayer > 21) {
			if (y.valueOfPlayer <=21) return y.valueOfPlayer;
			else return 0;
		}
		if (x.valueOfPlayer == y.valueOfPlayer) return x.valueOfPlayer;
			
		if (y.valueOfPlayer > 21) {
			if (x.valueOfPlayer <=21) return x.valueOfPlayer;
			else return 0;
		}
		
		else {
			if (y.valueOfPlayer > x.valueOfPlayer){
				
				return y.valueOfPlayer;
			}
			else {
				
				return x.valueOfPlayer;}
		}
		
		}
		
	}


