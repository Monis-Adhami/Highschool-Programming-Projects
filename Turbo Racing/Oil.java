import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 */
public class Oil extends Actor
{
    /**
     * @author Shumaima
    */ 
    public Oil ()
    {
        //Changes the size of the Oil 
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/20;
        int myNewWidth = (int)myImage.getWidth()/20;
        myImage.scale(myNewWidth,myNewHeight);
    }
}
