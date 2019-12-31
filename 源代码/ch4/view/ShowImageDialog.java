package ch4.view;
import java.awt.*;
import javax.swing.*;
public class ShowImageDialog extends JDialog   { 
    Image img;
    ShowImageDialog(Image img) { 
       this.img = img;	
       setSize(500,470);
       GiveImage image = new GiveImage();
       add(image);
       setModal(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class GiveImage extends JPanel  { 
       public void paintComponent(Graphics g ) {
          super.paintComponent(g);
          g.drawImage(img,0,0,getBounds().width,getBounds().height,this);
       }
    }
}