import javax.swing.*;
public class myFrame extends JFrame{
    myPanel panel;
	myFrame(){
	 panel= new myPanel();
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(500,500);
	
	this.add(panel);
	this.pack();
	this.setLocationRelativeTo(null);
	this.setVisible(true);
} 
}