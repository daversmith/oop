
public class Die implements DieInterface {
	public int sides;
	public Object options[];
	public Object value;
	public Die()
	{
		this(6);
	}
	public Die(int sides)
	{
		this.sides = sides;
		this.options = new Object[sides];
		this.setDieOptions();
		
	}
	
	public Object roll()
	{
		double random = Math.random() * (sides) + 1;
		int index = (int) random - 1;
		this. value = options[index];
		return this.value;
	}
	
	protected void setDieOptions() 
	{
		for(int i=0; i<sides; i++)
			options[i] = i+1;
	}	
	
	public Object getValue()
	{
		return this.value;
	}
}
