import java.util.*;
public class RespondTestBETA {
	public static Scanner input = new Scanner(System.in);
	public static Random rnd = new Random();
	public static String[][] IAmHighAndAlsoThisScores; 
	public static void main(String[] args) throws InterruptedException {
		boolean start = true;
		System.out.println("Let's play BANG!!");
		zero();
		while(start)
		{
			System.out.println("Once \"BANG\" appears hit enter");
			System.out.println("Hit enter to start");
			input.nextLine();
			double time = thisTestIsAddictive()/1000;
			System.out.println("Your respond Time is "+time);
			checkTime(time);
			if(time != 0)
			{
				highScores(time);
			}
			System.out.println("Watch the HighScores (Y/N) ?");
			char IAmHigh = input.next().charAt(0);
			if(IAmHigh == 'Y' || IAmHigh == 'y')
			{
				printHighScores(IAmHighAndAlsoThisScores);
			}
			System.out.print("would like to continue (Y/N)");
			char con = input.next().charAt(0);
			if(con == 'N' || con == 'n')
			{
				start = false;
			}
		}

	}
	public static void zero(){
		int n = 0;
		while(n<1)
		{
			System.out.println("Choose how many scores the HighScores board will show");
			n = input.nextInt();
			IAmHighAndAlsoThisScores = new String[n][2];
		}
		for (int i = 0; i < IAmHighAndAlsoThisScores.length; i++) 
		{
			IAmHighAndAlsoThisScores[i][0] = "nobody";
			IAmHighAndAlsoThisScores[i][1] = "500";
		}
	}
	// System.currentTimeMillis() הפעולה לבדיקת הזמן
	public static double thisTestIsAddictive()throws InterruptedException{
		int wait = rnd.nextInt(10000)+1000;
		long time = 0;
		Thread.sleep(wait);
		System.out.println("BANG!!!");
		while(time == 0)
		{
			time = System.currentTimeMillis();
			input.nextLine();
			time = System.currentTimeMillis()-time;
		}
		return time;
	}
	public static void checkTime(double time)throws InterruptedException{
		Thread.sleep(700);
		if(time < 0.3)
		{
			System.out.println("You are a GOD!!!!");
		}
		else if(time >0.3 && time < 0.5)
		{
			System.out.println("Humans sucks... I can do much better ");
		}
		else
		{
			System.out.println("oh.. your'e here...");
		}
	}
	// String text = Double.toString(number); 
	// double number = Double.parseDouble(text);
	public static void highScores(double time){
		double num ;
		for (int i = 0; i < IAmHighAndAlsoThisScores.length; i++) 
		{
			num = Double.parseDouble(IAmHighAndAlsoThisScores[i][1]);
				if(num > time)
				{ 
					System.out.println("Congratulations!!! you won the "+(i+1)+" place!");
					System.out.println("Enter your name:");
					String name = input.nextLine();
					for (int j = IAmHighAndAlsoThisScores.length-1; j > i; j--) {
						IAmHighAndAlsoThisScores[j][0] = IAmHighAndAlsoThisScores[j-1][0];
						IAmHighAndAlsoThisScores[j][1] = IAmHighAndAlsoThisScores[j-1][1];  
					}
					String score = Double.toString(time);
					IAmHighAndAlsoThisScores[i][0] = name;
					IAmHighAndAlsoThisScores[i][1] = score;
					i = IAmHighAndAlsoThisScores.length;
				}
		}
	}
	public static void printHighScores(String[][] IAmHighAndAlsoThisScores){
		for (int i = 0; i < IAmHighAndAlsoThisScores.length; i++) 
		{
			System.out.print("#"+(i+1)+" ");
			for (int j = 0; j < IAmHighAndAlsoThisScores[i].length; j++) 
			{
				if(j==0)
				{
					System.out.print("Name:");
				}
				else if(j==1)
				{
					System.out.print(" Score:");
				}
				System.out.print(IAmHighAndAlsoThisScores[i][j]);
			}
			System.out.println();
		}
	}

}