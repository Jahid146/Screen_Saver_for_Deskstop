import java.awt.*;
import java.awt.event.*;



class MyScreenSaverFrame extends Frame {
    public MyScreenSaverFrame() {
        setSize(880,500);
        setBackground(Color.BLACK);
    }

   

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        
        g2.setColor(Color.BLUE);
        g2.setFont(g2.getFont().deriveFont(40f));
        
        g2.drawString("200203", 50, 100);
        g2.drawString("200205", 50, 400);
        
        g2.drawString("200205", 680, 400);
        g2.drawString("200203", 680, 100);
        Font font = new Font("Arial", Font.BOLD, 48);
        g2.setFont(font);
        g2.drawString("CSE",350,240);

        
        
    }
    
}


public class screen_saver extends WindowAdapter {
	 
	MyScreenSaverFrame f;    
	 screen_saver(){
		 f = new  MyScreenSaverFrame();
		 f.addWindowListener (this);  
		 f.setVisible (true);
		  
	 }
     
	 public void windowClosing (WindowEvent e) {    
		    f.dispose();    
		}   
	 
    public static void main(String[] args) {
        
            var screen_saver = new screen_saver();
    }
}
