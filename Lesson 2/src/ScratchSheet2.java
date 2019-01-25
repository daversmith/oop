
public class ScratchSheet2 {

	public static void main(String[] args)
	{
		DiePiece die = new DiePiece();
		DiePiece die1 = new DiePiece(20);
		testRolls();
		playCraps();
	}
	
	public static void testRolls()
	{
		DiePiece die1 = new DiePiece(20);
		for(int i=0; i<10; i++)
		{
			System.out.println(die1.roll());
		}
	}
	
	public static void playCraps()
	{
		CrapsGame craps = new CrapsGame(); 
		craps.playGame();
	}
}
