import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false);
        // Create a new spaceship autopmatically
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 300, 200);
    }
    public void act()
    {
    // Add a rock anywhere along the border of the game
        Rock rock = new Rock();
        switch (Greenfoot.getRandomNumber(4)) {
            case 0:
                // Add the rock on the top border
                addObject(rock, Greenfoot.getRandomNumber(getWidth()), 0);
                break;
            case 1:
                // Add the rock on the bottom border
                addObject(rock, Greenfoot.getRandomNumber(getWidth()), getHeight() - 1);
                break;
            case 2:
                // Add the rock on the left border
                addObject(rock, 0, Greenfoot.getRandomNumber(getHeight()));
                break;
            case 3:
                // Add the rock on the right border
                addObject(rock, getWidth() - 1, Greenfoot.getRandomNumber(getHeight()));
                break;
        }
    }
}
