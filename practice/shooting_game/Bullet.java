import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(6);
        World world = getWorld();
        // score if the bullet hit any rocks
        if(!getObjectsInRange(20,Rock.class).isEmpty()){
            Rock rock = (Rock) getObjectsInRange(20,Rock.class).get(0);
            Score score = (Score) getWorld().getObjects(Score.class).get(0);
            score.increase();
            world.removeObject(rock);
            world.removeObject(this);
            return;
        }
        
        // remove the bullet if it is out of the game area
        if(getX() < 0 || getX() >= world.getWidth() 
           || getY() < 0 || getY() >= world.getHeight()){
           world.removeObject(this);    
        }
    }
}
