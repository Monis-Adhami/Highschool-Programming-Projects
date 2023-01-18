import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class takes the players to the actual game screen which then allows them to play and have fun
 * 
 * @Shumaima
 * 
 */
public class Play extends Buttons
{
  public Play()
  {
      //Creates the word Play and the code below controls its color and size
      GreenfootImage playButton = new GreenfootImage(100,60);
      Font adjustedFont = new Font(true,false,40);
      playButton.setFont(adjustedFont);
      playButton.setColor(Color.WHITE);
      playButton.drawString("Play",0,50);
      setImage(playButton);
  }
  
  public void act()
  {
      //Takes the player to the game screen where they can then race and enjoy the game
      checkMouse();
      checkClick(new MyWorld());
     
  }
}
