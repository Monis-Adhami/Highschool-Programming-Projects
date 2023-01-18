import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @author Monis 
 * 
 */
public class Menu extends World
{
    // Sound track for the game
    private GreenfootSound soundtrack = new GreenfootSound("racingMusic.mp3");
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1);
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("Menu.jpg");
        MenuPicture logoPic = new MenuPicture(logo);
        addObject(logoPic,getWidth()/2,322);
        Play play = new Play();
        addObject(play,56,336);
        play.setLocation(108,333);
        Instructions instructions = new Instructions();
        addObject(instructions,128,394);
        instructions.setLocation(117,371);
        play.setLocation(79,309);
        instructions.setLocation(124,350);
        play.setLocation(86,263);
        instructions.setLocation(128,305);
        Exit exit = new Exit();
        addObject(exit,70,401);
        exit.setLocation(61,356);
        play.setLocation(63,259);
        play.setLocation(63,253);
        play.setLocation(63,258);
    }
    
    public void started()
    {
        soundtrack.play();
    }
    
    public void stopped()
    {
        soundtrack.stop();
    }
}
