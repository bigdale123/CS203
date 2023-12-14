import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TetrisViewer{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setSize(300,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TetrisComponent t = new TetrisComponent();
    ArrayList<String> Shapes = new ArrayList(Arrays.asList("I","J","O","L","T","S","Z")); //Initializing method found here: https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/
    Random random = new Random();
    String shape = Shapes.get(random.nextInt(7));
    Color white = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
    t.setTetromino("Z",white);
    frame.add(t);
    frame.setVisible(true);
  }
}
