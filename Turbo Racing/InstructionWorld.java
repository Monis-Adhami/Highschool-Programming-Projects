import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Visuals done by Monis, Code done by Shumaima
 * 
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     * 
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 650, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Leave leave = new Leave();
        addObject(leave,922,606);
        leave.setLocation(950,611);
        leave.setLocation(957,610);
    }
}
