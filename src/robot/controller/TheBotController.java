package robot.controller;

import lejos.nxt.Button;
import robot.model.TheBot;

public class TheBotController 
{
	private TheBot myBot;
	
	public TheBotController()
	{
		myBot = new TheBot();
	}
	
	
	public void start()
	{
		//while( Button.waitForAnyPress() != Button.ID_ESCAPE)
	//	{
			myBot.drawShape(1, 1);	
		//}
		
	}
		
	
}
