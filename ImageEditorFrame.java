import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
public class ImageEditorFrame extends JFrame{
	
	
	public static void main(String[] args){
		ImageEditorFrame frame = new ImageEditorFrame();
		ImageEditorPanel panel =  new ImageEditorPanel();
		frame.add(panel);
		frame.setDummyImage(panel);
	}
	
	private void setDummyImage(ImageEditorPanel panel){
		BufferedImage bufferedImage =
		new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.getGraphics();
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 380, 280);
		panel.setImage(bufferedImage);
	}

	public ImageEditorFrame(){
		setTitle("Fenster");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}
 
}
