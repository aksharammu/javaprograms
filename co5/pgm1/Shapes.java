import java.awt.*;
import java.applet.*;

/*
<applet code="Shapes" width=500 height=500>
</applet>
*/

public class Shapes extends Applet
{
	public void paint(Graphics g)
{
		g.fillOval(120,40,80,80);
		g.drawLine(60,130,250,130);
		g.fillRect(130,145,80,75);
	}
}