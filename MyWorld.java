import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootImage frames[] = new GreenfootImage[19];
    
    private int slowness = 5;
    
    private int gifSpeedCounter = 0;
    
    private int actCycle = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        
        for( int i = 0; i < frames.length; i++)
        {
            frames[i] = new GreenfootImage("frame_" + i + "_delay-0.1s.gif");
        }
        
        setBackground(frames[0]);
    }
    
    /**
     * act Method runs every frame when run is pressed, and every time act is pressed
     */
    public void act()
    {
        setBackground( frames[actCycle % frames.length] );
        
        if(gifSpeedCounter == slowness)
        {
            actCycle++;
            gifSpeedCounter = 0;
        }
        else
        {
            gifSpeedCounter++;
        }
    }
    
    /**
     * setSlowness allows the user to set the speed of the gif
     * 
     * @param The parameter is an integer
     * @return There is no return type
     */
    public void setSlowness(int d)
    {
        slowness = d;
    }
}
