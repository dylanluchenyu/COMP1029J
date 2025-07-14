import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Rotate the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        else if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }

        // Move the spaceship based on the key pressed
        if (Greenfoot.isKeyDown("up")) {
        move(4);
        }
        
        //check if there is a collision
        if (!getObjectsInRange(20, Rock.class).isEmpty()) {
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, getX(), getY());
            getWorld().removeObject(this);
            // Stop the game
            Greenfoot.stop();
        }
    }
}
