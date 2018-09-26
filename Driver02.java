import javax.swing.*;
import java.awt.*;
/**
 *  This is the driver for the Panel02 Lab.
 *
 * @author Nick He
 * @author Kevin Liu
 * @version %I%, %G%
 */

public class Driver02
{
    static String fileLocation, frameColor;
    static int ySize, xSize, circleDiameter;

    /**
     * Code for constructing the initial panel here.
     *
     */
    public static void main(String[] args){
        JFrame frame = new JFrame ("Lab02");
        inputOptions();
        String fileLocation = "";
        frame.setSize(400,400);
        frame.setLocation(100,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel02(xSize, ySize, fileLocation, circleDiameter, frameColor));
        frame.setVisible(true);
    }

    public static void inputOptions(){
        fileLocation = JOptionPane.showInputDialog("Input fully qualified path to image.");
        ySize = Integer.parseInt(JOptionPane.showInputDialog("Input number of pixels high image is."));
        xSize = Integer.parseInt(JOptionPane.showInputDialog("Input number of pixels wide image is."));
        frameColor = JOptionPane.showInputDialog("Choose Frame Color: Red/Green/Blue/Black");
        circleDiameter = Integer.parseInt(JOptionPane.showInputDialog("Input diameter of border circles"));
    }
}