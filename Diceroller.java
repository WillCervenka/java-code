import java.util.Scanner;
import java.util.Random;

public class Diceroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		
		int finroll = 0;
		
		System.out.println("what dice? (20, 12, 10, 8, 6, 4)");
		int dice = key.nextInt();
		
		System.out.println("how many of said dice?");
		int dinum = key.nextInt();
		
		System.out.println("list any modifiers. include correct signage. if none input zero");
		int modif = key.nextInt();
		
		System.out.println("would you like to total the rolls? yes or no.");
		String add = key.next();
		
		switch (add)
		{
			case "no":
				switch (dice)
				{
				 case 20:
				 	while (dinum > 0)
				 	{
				 		int ranum = rand.nextInt(20);
				 		finroll = ranum + modif + 1;
				 		System.out.print(" "+finroll+" ");
				 		dinum = dinum -1;
				 	}
				 	break;
				 case 12:
					 	while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(12);
					 		finroll = ranum + modif + 1;
					 		System.out.print(" "+finroll+" ");
					 		dinum = dinum -1;
					 	}
					 	break;
				 case 10:
					 	while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(10);
					 		finroll = ranum + modif + 1;
					 		System.out.print(" "+finroll+" ");
					 		dinum = dinum -1;
					 	}
					 	break;
				 case 8:
					 	while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(8);
					 		finroll = ranum + modif + 1;
					 		System.out.print(" "+finroll+" ");
					 		dinum = dinum -1;
					 	}
					 	break;
				 case 6:
					 	while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(6);
					 		finroll = ranum + modif + 1;
					 		System.out.print(" "+finroll+" ");
					 		dinum = dinum -1;
					 	}
					 	break;
				 case 4:
					 	while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(4);
					 		finroll = ranum + modif + 1;
					 		System.out.print(" "+finroll+" ");
					 		dinum = dinum -1;
					 	}
					 	break;
				}
			break;
			
			case "yes":
				switch (dice)
				{
				 case 20:
				 	while (dinum > 0)
				 	{
				 		int ranum = rand.nextInt(20);
				 		finroll = finroll + ranum + 1;
				 		dinum = dinum -1;
				 	}
				 	System.out.print(finroll + modif);
				 	break;
				 case 12:
					 while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(12);
					 		finroll = finroll + ranum + 1;
					 		dinum = dinum -1;
					 	}
					 	System.out.print(finroll + modif);
					 	break;
				 case 10:
					 while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(10);
					 		finroll = finroll + ranum + 1;
					 		dinum = dinum -1;
					 	}
					 	System.out.print(finroll + modif);
					 	break;
				 case 8:
					 while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(8);
					 		finroll = finroll + ranum + 1;
					 		dinum = dinum -1;
					 	}
					 	System.out.print(finroll + modif);
					 	break;
				 case 6:
					 while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(6);
					 		finroll = finroll + ranum + 1;
					 		dinum = dinum -1;
					 	}
					 	System.out.print(finroll + modif);
					 	break;
				 case 4:
					 while (dinum > 0)
					 	{
					 		int ranum = rand.nextInt(4);
					 		finroll = finroll + ranum + 1;
					 		dinum = dinum -1;
					 	}
					 	System.out.print(finroll + modif);
					 	break;
				}
				
		}
		
	}

}
