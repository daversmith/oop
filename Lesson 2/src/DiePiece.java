
public class DiePiece {
	private int sides;
	private int sideUp;
	private int range[];
	private int value;
	
	
	
	public DiePiece(int sides)
	{
		this.sides = sides;
		this.sideUp = 1;
		this.value = 0;
		this.range = new int[sides];
		
		for(int i=0; i<sides; i++)
		{
			this.range[i] = i+1;
		}
	}
	
	public DiePiece()
	{
		this(6);
	}
	
	public int getSides()
	{
		return this.sides;
	}
	
	public int roll()
	{
		double random = Math.random() * sides;
		int index = (int) random;
		this.value = this.range[index];
		return this.value;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public static void main(String[] args)
	{
		DiePiece die = new DiePiece();
		DiePiece die1 = new DiePiece(20);
		
		die.sides = 17;
		System.out.println(die.getSides());
		System.out.println(die1.getSides());
	}
}
