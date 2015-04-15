import greenfoot.*;

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        turn(5);
        //this.setLocation(Greenfoot.getRandomNumber(900),Greenfoot.getRandomNumber(700));
    }    
}
