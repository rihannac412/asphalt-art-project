import org.code.neighborhood.*;

public class FacePainter extends PainterPlus {
/**
  *creates the base for the smiley face and all things it needs w/ starting postion to center in the middle
  *paints the yellow square for face
  */
  public void paintFace() {
    startingPosition();
int count = 0;
    while(count < 6){
     paintLine(12,"yellow");
      leftToRight();

      paintLine(12,"yellow");
      rightToLeft();
      count++;
    }
  }
  /**
  *uses for loop to bring the painter to the middle before painting
  *brings painter to the middle ish of the grid
  */
  public void startingPosition(){
    for(int i = 0; i < 10; i++){
      if(canMove()){
        move();
      }
    }
    turnRight();
    for(int i = 0; i < 10; i++){
      if(canMove()){
        move();
      }
    }
    turnLeft();
  }
  /**
  *lets you make a method to paint a line with exact color and number of squares
  *the painter paints the line in the color and sixe of your choosing
  */
       public void paintLine(int size, String color) {
    for (int i = 0; i < size; i++) {
      paint(color);
      move();
    }
       }
  //moves painter from side to side easier no repeating code
    public void rightToLeft(){
      turnLeft();
      if(canMove()){
        move();
      }
      turnLeft();
    }
  //moves painter from side to side easier no repeating code
    public void leftToRight(){
      turnRight();
      if(canMove()){
        move();
      }
      turnRight();
    }
  }
    
  
