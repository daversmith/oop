
public class ColorDie extends Die {

	public ColorDie(int sides) {
		super(sides);

	}

	protected void setDieOptions() 
	{
		String colors[] = {"red", "yellow", "green", "blue", "white", "black"};
		for(int i=0; i<sides; i++)
			options[i] = colors[i];
	}
	protected void setDieOptions(String[] options)
	{
		this.sides = options.length;
		for(int i=0; i<sides; i++)
			options[i] = options[i];
	}
}
