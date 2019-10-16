// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05vst extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
		for (int k = 0; k<=70; k++){
			g.drawLine(990-(14*k),640,990,((9*k)+10));
		}
		for (int k = 0; k<=70; k++){
			g.drawLine(10+(14*k),640,10,((9*k)+10));
		}
		for (int k = 0; k<=70; k++){
			g.drawLine(990,640-(9*k),990-(14*k),10);
		}
		for (int k = 0; k<=70; k++){
			g.drawLine(10,640-(9*k),10+(14*k),10);
		}
		g.drawRect(228,184,540,282);
		//next
		for (int k = 0; k<=68; k++){
			g.drawLine(768-(8*k),466,768,184+(4*k));
		}
		g.drawLine(282,466,768,460);
		}
	}
