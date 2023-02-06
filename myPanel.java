import java.awt.*;
import javax.swing.*;
public class myPanel extends JPanel{
    myPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D)g;
        g2D.setStroke(new BasicStroke(2));

    }
}