package robot.model;

import lejos.nxt.Button;
import lejos.nxt.*;

public class TheBot 
{

	private UltrasonicSensor mySonar;
	private TouchSensor frontTouch;
	private TouchSensor backTouch;
	private SoundSensor microphone;
	public  TheBot()
	{
		mySonar = new UltrasonicSensor(SensorPort.S1);
		frontTouch = new TouchSensor(SensorPort.S2);
		backTouch = new TouchSensor(SensorPort.S3);
		microphone = new SoundSensor(SensorPort.S4);
	}
	/**
	 * uses the SoundSensor Object microphone to dance
	 * microphone.readValue() will be the method used to determine danceness
	 */
	public void danceRobotDance()
	{
		microphone.readValue();
	}
	/**
	 * Uses the TouchSensor, specifically the isPressed() method to move away from objects and continue moving
	 */
	public void hasHaphephobia()
	{
		
	}
	/**
	 * Use this method and the mySonar object to avoid objects and drive around the room.
	 * You should stay about 8-12 inches away from objects
	 * and use the MySonar.getDistance method to calculate that.
	 */
	public void driveAroundRoom()
	{
		
	}
	public void drawShape(int vertexCount, int length)
	{
		int angle = (int) calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.forward();
				Motor.C.forward();
				Thread.sleep(length* 10000);
				Motor.B.stop();
				Motor.C.stop();
//				Motor.B.forward();
//				Motor.C.backward();
//				Thread.sleep(length* 1000);
//				Motor.B.stop();
//				Motor.C.stop();
				
			

				{
					Button.ENTER.waitForPressAndRelease();
					for(int t = 0; t < 3; t++)
					{
					Motor.B.forward();
					Motor.C.backward();
					Thread.sleep(length* 500);
					Motor.B.stop();
					Motor.C.stop();
					Motor.B.forward();
					Motor.C.forward();
					Thread.sleep(length* 166);
					Motor.B.stop();
					Motor.C.stop();
					}
				}
		
				{
					Button.ESCAPE.waitForPressAndRelease();
					for(int s = 0; s <4; s++)
					{
					Motor.B.forward();
					Motor.C.backward();
					Thread.sleep(length* 2000);
					Motor.B.stop();
					Motor.C.stop(); 
					Motor.B.forward();
					Motor.C.forward();
					Thread.sleep(length* 500);
					Motor.B.stop();
					Motor.C.stop();
					}
				}
				
				
				
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	private double calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if( vertexCount != 0)
		{
			currentAngle = 360/vertexCount;
		}
		return currentAngle;
	}
	
}
