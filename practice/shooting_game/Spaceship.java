import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

        
        /**
         * Task 2 - Shoot the bullet
         */
        
        // If the player presses the spacebar key
        if(Greenfoot.isKeyDown("space")){
            if(getWorld().getObjects(Bullet.class).isEmpty()){
                // if there is currently no bullet in the game
                // add a bullet
                Bullet bullet = new Bullet();
                bullet.setRotation(getRotation());
                getWorld().addObject(bullet,getX(),getY());
            }
        }

        // Check if a rock hits the spaceship
        if (!getObjectsInRange(60, Rock.class).isEmpty()) {
            // Add an explosion at the spaceship position
            Explosion explosion = new Explosion();
            getWorld().addObject(explosion, getX(), getY());

            // Remove the spaceship from the world
            getWorld().removeObject(this);
            
            // Stop the game
            Greenfoot.stop();
        }
    }
}
