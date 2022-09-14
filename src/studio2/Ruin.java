package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	for (int totalSimulations = 1; totalSimulations <= 5; totalSimulations++)
	{
		int startAmount = 300;
		while (startAmount < 600 && startAmount > 0)
		{
			double winChance = Math.random();
			if (winChance < 0.5)
			{
				startAmount+=50;
			}
			else 
			{
			startAmount-=50;
			}
			
		}

		if (startAmount >= 600)
		{
			System.out.println("YOU WIN!");
		}
		else if (startAmount <= 0)
		{
			System.out.println("Take yo butt home loser.");
		}
	}
	
	}
}
