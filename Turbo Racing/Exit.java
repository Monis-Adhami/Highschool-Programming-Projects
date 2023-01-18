import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class will stop the game if clicked 
 * 
 * @Shumaima
 * 
 */
public class Exit extends Buttons
{
    public Exit()
    {
      //Creates the word Exit and the code below controls its color and size
      GreenfootImage playButton = new GreenfootImage(100,60);
      Font adjustedFont = new Font(true,false,40);
      playButton.setFont(adjustedFont);
      playButton.setColor(Color.WHITE);
      playButton.drawString("Exit",0,50);
      setImage(playButton);
    }
    public void act() 
    {
      //If the button exit gets clicked, it will stop the greenfoot program
      checkMouse();
      if(Greenfoot.mouseClicked(this))
      {
          Greenfoot.stop();
      }
    }    
}
