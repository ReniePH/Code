/*
 * What is The real length Of a sport run.
 * 
 * i didn't realize how to make a md file so i'm writing this here
 * 
 * hmm okay so this program is just to measure the real length of most of our sport runs
 * (in a square not in a circle)
 * so basically i take into consideration the length of the entire run, the length of each round, and the ratio of the of the field
 * when you do a turn you are most likely to cut a bit of the run(and if the teacher is not looking a bit more than a bit)
 * so the loop simulate the cut of the run in half of an entire leap.
 * now every time you cut, you most likely to do it in 45 degrees so i took it as a basis degree( if i had to deal with different degrees
 * it would have been a lot harder.
 * so basically each time you cut the turn you create a triangle like this
 *   ----------
 * |/          \|
 * |            |
 * |            | 
 * |            |
 * |\          /|
 *   ----------
 * so when you cut a bit of the round you cut both the width and the length of the field in the same amount.
 * so thats why i have current cut and lastcut.
 * however when you cut you run the length of the remaining distance in the side time the square root of 2(x/sin90 = cut/sin45)
 * so thats why i added it each time
 * i wanted to make it a little funny (because lets face it its not so complicated piece of code) so i added quite a lot of useless lines
 * just for fun.(prob wont do in a real project).
 * 
 * now last there is the actual cut which vairy from 0 to 4 meters in length.
 * i just made a random formula that determined the length of the cut(because you cant always cut 4 meters the teacher might be watching)
 * in addition when you cut 4 meters you run almost 6 meters (square root of 32) in a danger zone(the teacher might see) so i decided that 
 * because of this it will be the final length.
 * hope its good enough XD 
 */
import java.util.Scanner;
public class SportIsHard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double run, runRatio1, runRatio2, eachRoundLength;
		System.out.println("Enter the length of the entire run:");
		run = in.nextDouble();
		System.out.println("Enter the length of the each round:");
		eachRoundLength = in.nextDouble();
		if(run%eachRoundLength != 0)
		{
			System.out.println("The length of each round does not add up to the length of the entire run dumbass");
			System.out.println("Enter the length of the each round again, and this time do this properly");
			eachRoundLength = in.nextDouble();
		}
		if(run%eachRoundLength != 0)
		{
			System.out.println("are you fucking kidding me?! the fuck is wrong with you?");
			System.out.println("im not letting you get away with this, either you enter this properly or we wont go anywhere");
			eachRoundLength = in.nextDouble();
		}
		while(run%eachRoundLength != 0)
		{
			System.out.println("Dafuq dude dafuq?");
			eachRoundLength = in.nextDouble();
		}
		System.out.println("Enter the ratio of the field (for example 2:1)");
		System.out.println("please consider that the sum of the ratio must be divideable by the length of the run");
		System.out.println("Length:");
		runRatio1 = in.nextDouble();
		System.out.println("Width:");
		runRatio2 = in.nextDouble();
		while(run%(runRatio1+runRatio2) != 0)
		{
			System.out.println("Errrr wrong answer try again");
			System.out.println("Length:");
			runRatio1 = in.nextDouble();
			System.out.println("Width:");
			runRatio2 = in.nextDouble();
		}
		double length = (runRatio1/(2*(runRatio1+runRatio2)))*(eachRoundLength/2);
		double width = (runRatio2/(2*(runRatio1+runRatio2)))*(eachRoundLength/2);
		double totalRounds =  run/eachRoundLength;
		// add a check if round number is round
		int realRun=0;
		int currentCut,lastCut=0;
		for (int i = 0; i < totalRounds*2; i++) 
		{
			currentCut=cut(run,length);
			realRun += (int)(currentCut+lastCut-(currentCut*Math.sqrt(2)));
			lastCut = currentCut;
			currentCut=cut(run,width);
			realRun += (int)(currentCut+lastCut-(currentCut*Math.sqrt(2)));
			lastCut = currentCut;
		}
		
		realRun = (int)run-realRun;
		System.out.println("the real run was "+realRun+" meters");
		System.out.println("Thats only "+(realRun/(run/100))+"% of the run");
		

	}
	// returns the part of the run that is taken off
	public static int cut(double run, double currentPart)
	{
		return (int)((run/(run+currentPart))+Math.random()*4);	
	}

}
