package blackJack;

public class PlayingTable {
	
	public static void main (String []args) {
		player x = new player(10);
		dealer v = new dealer(21);
		
		GameRules playing = new GameRules();
		System.out.println(playing.GamePlayed(v, x));
	}
}
