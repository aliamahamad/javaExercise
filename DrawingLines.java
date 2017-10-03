import java.applet.*;
import java.awt.*;

public class DrawingLines extends Applet {
	int width, height;

	public void init() {

		width = getSize().width;
		height = getSize().height;
		setBackground( Color.black);
	}

	public void paint( Graphics g ) {

		g.setColor( Color.green );

		for ( int i = 0; i < 10; ++i ) {

			g.drawLine( width, height, i * width / 10, 0 );

		}
	}
}

// Now compile the above code and call the generated
// class in your HTML code as follows:
/*---------------------------
<HTML>
<HEAD>
</HEAD>
<BODY>
<div >
<APPLET CODE="DrawingLines.class" WIDTH="600" HEIGHT="400">
</APPLET>
</div>
</BODY>
</HTML>
---------------------------*/