import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class TetrisComponent extends JComponent{
  private String Shape = "";
  private Color RGB = new Color(0,0,0);
  public void paintComponent(Graphics g){
    Random random = new Random();
    Graphics2D g2 = (Graphics2D) g;
    Rectangle box1 = new Rectangle(0,0,25,25);
    // Let it be known I tried to implement switch-case, but it didn't play nice with something and I couldn't figure it out.
    // Rectangle methods sourced here: https://www.cis.upenn.edu/~bcpierce/courses/629/jdkdocs/api/java.awt.Rectangle.html
    if (this.Shape == "I" || this.Shape == "Z" || this.Shape == "O" || this.Shape == "T"){
         box1.setLocation(random.nextInt(91)+10,random.nextInt(91)+10);
    }
    else if (this.Shape == "J" || this.Shape == "L"){
      box1.setLocation(random.nextInt(91)+36,random.nextInt(91)+10);
    }
    else if (this.Shape == "S"){
      box1.setLocation(random.nextInt(91)+10,random.nextInt(91)+36);
    }
    //First Square
    g2.setColor(new Color(0,0,0));
    g2.setStroke(new BasicStroke(2));
    g2.draw(box1);
    g2.setColor(this.RGB);
    g2.fill(box1);
    //Second Square
    g2.setColor(new Color(0,0,0));
    g2.setStroke(new BasicStroke(2));
    if (this.Shape == "I" || this.Shape == "J" || this.Shape == "L"){
      box1.setLocation((int)box1.getLocation().getX(),(int)box1.getLocation().getY()+26);
    }
    else if (this.Shape == "S" || this.Shape == "Z" || this.Shape == "O" || this.Shape == "T"){
      box1.setLocation((int)box1.getLocation().getX()+26,(int)box1.getLocation().getY());
    }
    g2.draw(box1);
    g2.setColor(this.RGB);
    g2.fill(box1);
    //Third Square
    g2.setColor(new Color(0,0,0));
    g2.setStroke(new BasicStroke(2));
    if (this.Shape == "I" || this.Shape == "J" || this.Shape == "L" || this.Shape == "O" || this.Shape == "Z"){
      box1.setLocation((int)box1.getLocation().getX(),(int)box1.getLocation().getY()+26);
    }
    else if (this.Shape == "S" || this.Shape == "Z" || this.Shape == "T"){
      if(this.Shape == "S"){
        box1.setLocation((int)box1.getLocation().getX(),(int)box1.getLocation().getY()-26);
      }
      else if (this.Shape == "T"){
        box1.setLocation((int)box1.getLocation().getX()+26,(int)box1.getLocation().getY());
      }
    }
    g2.draw(box1);
    g2.setColor(this.RGB);
    g2.fill(box1);
    //Fourth Square
    g2.setColor(new Color(0,0,0));
    g2.setStroke(new BasicStroke(2));
    if (this.Shape == "I"){
      box1.setLocation((int)box1.getLocation().getX(),(int)box1.getLocation().getY()+26);
    }
    else if(this.Shape == "L" || this.Shape == "J" || this.Shape == "S" || this.Shape == "Z" || this.Shape == "O"){
      if (this.Shape == "L" || this.Shape == "S" || this.Shape == "Z"){
        box1.setLocation((int)box1.getLocation().getX()+26,(int)box1.getLocation().getY());
      }
      else if (this.Shape == "J" || this.Shape == "O"){
        box1.setLocation((int)box1.getLocation().getX()-26,(int)box1.getLocation().getY());
      }
    }
    else if (this.Shape == "T"){
        box1.setLocation((int)box1.getLocation().getX()-26,(int)box1.getLocation().getY()+26);
    }
    g2.draw(box1);
    g2.setColor(this.RGB);
    g2.fill(box1);
    }
  public void setTetromino(String Shape, Color RGB){
    this.RGB = RGB;
    this.Shape = Shape;
    //System.out.println(this.RGB);
    //System.out.println(this.Shape);
  }
}
