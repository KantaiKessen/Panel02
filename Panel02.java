import javax.swing.*;
import java.awt.*;
/**
 * This class will create a JFrame that displays the file from Google Classroom. The picture will
 * be encased in a frame and will have a short message accross the bottom of the panel.
 *
 * @author Nick He
 * @author Kevin Liu
 * @version %I%, %G%
 */
public class Panel02 extends JPanel
{
    int xWidth;
    int yWidth;
    String fileLocation;
    int circleDiameter;
    String frameColor;
    Color color;
    public Panel02(int xWidth, int yWidth, String fileLocation, int circleDiameter, String frameColor){
        this.xWidth = xWidth;
        this.yWidth = yWidth;
        this.fileName = fileLocation;
        this.circleDiameter = circleDiameter;
        this.frameColor = frameColor;
    }
    public void switchColor()
    {
        frameColor = frameColor.toUpperCase();
        switch (color) {
            case "GREEN":
                color = Color.GREEN;
            case "RED":
                color = Color.RED;
            case "BLUE":
                color = Color.BLUE;
            case "BLACK":
                color = Color.BLACK
        }
    }


    /**
     * Code for painting the image of the picture with its frame. Will create a 400x400 panel
     * to hold the picture using a Graphics argument
     * <p>
     * The frame color will be selected by user from
     *
     *
     *
     * @param g Provides the color and display components for the method.
     * @since   1.0
     */


    public void paintComponent(Graphics g)
    {
        ImageIcon picture = new ImageIcon(fileName);
        g.setColor(frameColor);

        g.drawImage(picture.getImage(), xLength, yLength, null);

        for (int x = 25; x < 300; x+=25)
        {
            g.fillOval (x , 25, 35, 35);
        }
        for (int x = 25; x < 300; x+=25)
        {
            g.fillOval (x , 205, 35, 35);
        }
        for (int x = 25; x <= 180; x+=25)
        {
            g.fillOval (25 , x, 35, 35);
        }
        for (int x = 25; x <= 205; x+=25)
        {
            g.fillOval (300, x, 35, 35);
        }

        g.setColor(Color.WHITE);
        g.drawString("Our Fearless Leader", 125, 300);
    }
}
