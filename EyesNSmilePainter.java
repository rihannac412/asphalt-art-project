import org.code.neighborhood.*;
/**
*EyesNSmilepianter creates the eyes and mouth of the smiley face
  *uses the paint donut for the eyes and a line painting 4 squares for the mouth
  */
public class EyesNSmilePainter extends PainterPlus {

  public void paintEyes (){
    moveToFace();
    move();
    paintDonut("black");
    move();
    move();
    move();
    move();
    move();
    paintDonut("black");
  }
  public void moveToFace(){
    for(int i = 0; i < 12; i++){
      if(canMove()){
        move();
      }
    }
    turnRight();
    for(int i = 0; i < 12; i++){
      if(canMove()){
        move();
      }
    }
    turnLeft();
  }
  /**
  *does not use the painter plus paint donut but uses its own so that it stops
  *paints the two eyes
  */
    public void paintDonut(String color){
    for(int i = 0; i <4; i++){
    move();
    turnRight();
     paint(color);
     move();
     paint(color);
    }
    }
  /**
  *uses for loop and paints the smile or mouth for smiley face
  *paints the 4 lines as the smile
  */
  public void paintSmile(){
    turnRight();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    
   
      
      for(int i = 0; i < 4; i++){
        paint("black");
        if(canMove()){
          move();
        }
     
        }
      }
  }
   
