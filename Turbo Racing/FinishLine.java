import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class FinishLine extends Actor
{
    /**
     * 
     * @author Shumaima
     */
    public FinishLine()
    {
        //Changes the size of the finishline 
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/5;
        myImage.scale(myNewWidth, myNewHeight);
        
    }
    
    
   
}
