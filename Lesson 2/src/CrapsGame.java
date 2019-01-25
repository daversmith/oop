import java.util.Scanner;

public class CrapsGame {
	int results[];
	String[] players;
	int turns;
	DiePiece[] dice;
	int firstRoll;
	boolean gameActive;
	boolean winner;
	Scanner input;
	
	public CrapsGame()
	{
		this.results = new int[2];
		this.turns = 0;
		this.gameActive = true;
		this.winner = false;
		this.firstRoll = 0;
		this.dice = new DiePiece[2];
		this.dice[0] = new DiePiece();
		this.dice[1] = new DiePiece();
		
		this.input = new Scanner(System.in);
	}
	
	public void setResults()
	{
		this.results[0] = this.dice[0].getValue();
		this.results[1] = this.dice[1].getValue();
	}
	
	public void rollDice()
	{
		for(int i=0; i<dice.length; i++)
			this.dice[i].roll();		
	}
	
	public void playGame()
	{
		while(this.gameActive)
		{
			this.getInput();
			this.rollDice();
			this.turns++;
			
			this.evaluate(this.sumDice());
			this.setResults();
			this.showResults();
		}
	}
	
	public void showResults()
	{
		System.out.println("Die1: "+this.dice[0].getValue());
		System.out.println("Die2: "+this.dice[1].getValue());
		System.out.println("Goal: "+this.firstRoll);
		
		if(!this.gameActive)
		{
			if(!this.winner)
			{
				System.out.println("You are a big Loser!!");
			}
			else
			{
				System.out.println("You are a Winner!!");
			}
		}
		else
			System.out.println("Roll again?");
	}
	public int sumDice()
	{
		int sum = 0;
		for(int i=0; i<dice.length; i++)
		{
			sum += this.dice[i].getValue();
		}
		if(this.turns == 1)
		{
			this.firstRoll = sum;
		}
		return sum;
	}
	
	public String getInput()
	{
		return this.input.nextLine();
	}
//	If first roll is 7 or 11 then Winner
//	If first roll is 2, 3, or 12 then Loser
//	Otherwise our goal is to re-roll the sum of the first roll
//	If a 7 or 11 is roll before goal is reached then Loser
//	If goal is reached before a 7 or 11 is rolled then Winner

	public boolean evaluate(int sum)
	{
		if(this.firstRoll == 7 || this.firstRoll == 11)
		{
			this.gameActive = false;
			this.winner = true;
		}
		else if(this.firstRoll == 2 || this.firstRoll == 3 || this.firstRoll == 12)
		{
			this.gameActive = false;
			this.winner = false;
		}
		else if(this.firstRoll == sum && this.turns > 1)
		{
			this.gameActive = false;
			this.winner = true;
		}
		else if(sum == 7 || sum == 11)
		{
			this.gameActive = false;
			this.winner = false;
		}
		return this.gameActive;
	}
}
