import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    // the constructor of Rock
    public Rock()
    {
        super();
        
        // Random turn the rock;
        turn(Greenfoot.getRandomNumber(360));
    }
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(4);
        // Remove the rock if it is out of the world
        World world = getWorld();
        if (getX() < 0 || getX() >= world.getWidth() ||
            getY() < 0 || getY() >= world.getHeight()) {
            world.removeObject(this);
        }
    }
}
