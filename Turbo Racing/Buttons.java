import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Monis
 * 
 */
public class Buttons extends Actor
{
  private boolean mouseOver = false;
  private static int MAX_TRANS = 255;
  
  public void checkMouse()
  {
      //Checks to see if the mouse is over a button and if it is, code below will change its opacity
      if(Greenfoot.mouseMoved(null))
      {
          mouseOver = Greenfoot.mouseMoved(this);
      }
      
      if(mouseOver)
      {
          adjTrans(MAX_TRANS/2);
      }
      else
      {
          adjTrans(MAX_TRANS);
      }
  }
  
  public void checkClick(World world)
  {
       if(Greenfoot.mouseClicked(this))
      {
          Greenfoot.setWorld(world);
      }
  }
  
  public void adjTrans(int adjust)
  {
      //Changes the buttons opacity 
      GreenfootImage tempImage = getImage();
      tempImage.setTransparency(adjust);
      setImage(tempImage);
  }
}
