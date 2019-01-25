import java.util.Scanner;

public class Craps {
	Die dice[];
	Scanner input;
	boolean gameActive;
	boolean winner;
	int[] results;
	int turns;
	int point;
	
	public Craps()
	{
		this.dice = new Die[2];
		this.dice[0] = new Die();
		this.dice[1] = new Die();
		
		this.results = new int[dice.length];

		this.input = new Scanner(System.in);
		System.out.println("Welcome to the game of Craps. Type any key to begin the game");
		String response = input.nextLine();
		this.startGame();
	}
	
	public void startGame()
	{
		this.gameActive = true;
		this.winner = false;
		
		this.turns = 0;	
		int selection = 0;
		
		this.rollDice();

		while(this.gameActive && !this.winner)
		{			
			this.showResults();
			if(!this.evaluateGame())
				break;
			selection = this.showMenu();
			this.evaluateSelection(selection);
			this.evaluateGame();
		}
		this.showResults();
		this.showGameResults();
	}
	private void rollDice()
	{
		for(int i=0; i<dice.length; i++)
		{
			results[i] = (int) dice[i].roll();
		}
		this.turns++;
	}
	private void rollDie(int die)
	{
		this.results[die] = (int) this.dice[die].roll();
		this.turns++;
	}
	private void showResults()
	{
		System.out.println("\n\n** die 1: "+dice[0].getValue()+" die 2: "+dice[1].getValue()+" **");
	}
	
	public int showMenu()
	{
		System.out.println("*************************************");
		System.out.println("                 Menu                ");
		System.out.println("*************************************");
		System.out.println("Type 1  to re-roll die 1             ");
		System.out.println("Type 2  to re-roll die 2             ");
		System.out.println("Type 3  to re-roll both dice  3      ");
		return input.nextInt();
		
	}
	
	private void evaluateSelection(int selection)
	{
		switch(selection)
		{
		    case 0: return;
			case 3:
				this.rollDice();
			break; 
			default:
				this.rollDie(selection-1);
			break;
			
		}
	}
	
	private boolean evaluateGame()
	{
		
		if(!this.gameActive)
		{
			this.gameActive = false;
			return this.gameActive;
		}
		else if(this.turns == 1)
		{
			this.point = this.sumDice();
			if(this.point == 7 || this.point == 11)
			{
				this.winner = true;
				this.gameActive = false;
			}
			else if(this.point == 2 || this.point == 3 || this.point == 12)
				this.gameActive = false;
		}
		else if(this.sumDice() == this.point)
			this.winner = true;
		else if(this.sumDice() == 7 || this.sumDice() == 11)
			this.gameActive = false;	
		
		return this.gameActive;
	}
	
	private int sumDice()
	{
		int sum = 0;
		for(int i=0; i<dice.length; i++)
			sum += (int) dice[i].getValue();
		return sum;
	}
	private void showGameResults()
	{
		if(this.winner)
		{
			System.out.println("Congartulations, You Win!!");
		}
		else
		{
			System.out.println("Better luck next time :(");
		}
		
		System.out.println("Would you like to play again? y/n");
		
		
		String yesNo = this.input.nextLine(); System.out.println(yesNo+"#");
		if(yesNo.equals("y"))
		{
			this.startGame();
		}
	}
}
