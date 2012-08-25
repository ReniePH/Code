package window;

public class Tick {
	public boolean milisec50()
	{
		long time;
		time = System.currentTimeMillis();
		while(System.currentTimeMillis() - time < 50)
		{	
		}
		return true;
	}

}
