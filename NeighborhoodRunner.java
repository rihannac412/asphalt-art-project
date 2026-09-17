import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    //makes new painter and paints background
BackgroundPainter bp = new BackgroundPainter();
     bp.paintBackground("white",64);
//makes new painter and paints the face/ makes the face
     FacePainter fp = new FacePainter();
   fp.paintFace(); 
//makes new painter and paints eyes and smile/mouth
     EyesNSmilePainter ep = new EyesNSmilePainter();
     ep.paintEyes();
    ep.paintSmile();