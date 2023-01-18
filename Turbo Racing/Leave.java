import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class allows the player to go back to the menu screen from the instruction screen
 * 
 * @author Monis 
 */
public class Leave extends Buttons
{
      public Leave()
    {
      //Creates the word Menu and the code below controls its color and size
      GreenfootImage playButton = new GreenfootImage(210,60);
      Font adjustedFont = new Font(true,false,40);
      playButton.setFont(adjustedFont);
      playButton.setColor(Color.WHITE);
      playButton.drawString("Menu",0,50);
      setImage(playButton);
    }
    
    public void act() 
    {
        //Takes the player back to the menu screen if the button menu is clicked
        checkMouse();
        checkClick(new Menu());
    }    
}
