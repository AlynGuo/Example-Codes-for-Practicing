import java. util. *;
public class SEAGames{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[] FinalScore = new double[5];
        double sum = 0, x;
        int idx, y, name;
        String key;
        String[] names = new String[5];
        
        System.out.println("SEA Games");
        System.out.println("\nEnter Five Participants with their Final Score: ");
        
        for(idx = 0; idx < 5; idx++)
        {
        	key = input.next();
        	x = input.nextDouble();
            names[idx] = key;
            FinalScore[idx] = x;
        }
        
        /*
        for(idx = 0; idx < names.length; idx++)
        {
        	System.out.println(names[idx]);
        	System.out.println(FinalScore[idx]);
        }
        */
        
        System.out.println("\nResult: ");
        
		name = 0;
		double gold;
		gold = FinalScore[0];
		
		for(y = 0; y < 5; y++)
		{
			if(y == name)
			{
				continue;
			}
			if(gold < FinalScore[y])
			{
				gold = FinalScore[y];
				name = y;
			}
		}
		System.out.println("Gold: " + names[name] + "-" + gold);
        
        int silver = 0;
        gold = FinalScore[0];
        
        for(y = 0; y < 5; y++)
        {
            if(y == name)
            {
                continue;
            }
            
            if(gold < FinalScore[y])
            {
                gold = FinalScore[y];
                silver = y;
            }
        }
		System.out.println("Silver: " + names[silver] + "-" + gold);
		
		int bronze = 0;
		gold = FinalScore[0];
		
		for(y = 0; y < 5; y++)
		{
			if((y == name) || (y == silver))
			{
				continue;
			}
			if(gold < FinalScore[y])
			{
				gold = FinalScore[y];
				bronze = y;
			}
		}
		System.out.println("Bronze: " + names[bronze] + "-" + gold);
    }
}