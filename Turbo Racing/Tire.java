import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tire extends Actor
{
    /**
     * @author Shumaima
     */ 
    public Tire()
    {
        //Changes the size of the tire class and makes it transparent 
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/53;
        int myNewWidth = (int)myImage.getWidth()/53;
        myImage.scale(myNewWidth,myNewHeight);
        getImage().setTransparency(0);
    }
}
