package loop.controller;

public class LoopController
{
	
	private Scanner keyboardInput;
	public LoopController();
	{
		keyboardInput = new Scanner(System.in);
	}
	
	
	public void start()
	{
		System.out.println("Today, we're expirimenting with loops!");
		System.out.println("Here we go!"); 
		
		System.out.println("Do you like Computer programming?");
		String answer = keyboardInput.nextLine();
		
		if(answer.equalsIgnoreCase("Yes"));
		{
			System.out.println("Me too! Who is your teacher?");
			
			if (answer.equalsIgnoreCase("Mr. Henrichsen"));
			{
				System.out.println("Isn't he the funniest?");
				
				if (answer.equalsIgnoreCase("Yeah"));
				{
					System.out.println("His jokes always make me laugh.");
				}
				else 
				{
					System.out.println("Is he a good teacher?");
				}
			}
		}
		
	}
}
