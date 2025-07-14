import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    // This class keeps track of the score of the game
    int score;
    
    /**
     * Create the score image in the constructor
     */
    public Score() {
        super();
        
        score = 0;
        setImage(new GreenfootImage(100, 50));
        draw();
    }
    
    /**
     * Draw the score on the image
     */
    public void draw() 
    {
        GreenfootImage image = getImage();  
        image.clear();
        image.setColor(Color.YELLOW);  
        image.setFont(new Font("Arial", true, false, 18));
        image.drawString("Score: " + score, 20, 30);  
    }
    
    /**
     * Increase the score by one
     */
    public void increase() {
        score = score + 1;
        draw();
    }
}
