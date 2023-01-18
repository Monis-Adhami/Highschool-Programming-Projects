import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class takes the player to an instruction screen which explains the controls and how the game works
 * 
 * @Shumaima
 * 
 */
public class Instructions extends Buttons
{
    public Instructions()
    {
      //Creates the word Instruction and the code below controls its color and size
      GreenfootImage playButton = new GreenfootImage(230,60);
      Font adjustedFont = new Font(true,false,40);
      playButton.setFont(adjustedFont);
      playButton.setColor(Color.WHITE);
      playButton.drawString("Instructions",0,50);
      setImage(playButton);
    }
    
    public void act() 
    {
        //Takes the player to the instruction screen if the instruction button were to be pressed
        checkMouse();
        checkClick(new InstructionWorld());
    }    
}
