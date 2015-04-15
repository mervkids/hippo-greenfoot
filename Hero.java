import greenfoot.*;

/**
 * Write a description of class Hero here.
 * 
 * @author Andre Christo 
 * @version G1W2
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
         if(Greenfoot.isKeyDown("left"))
         {
             //move(2);
             this.setLocation(this.getX()-5,this.getY());
            }
            if(Greenfoot.isKeyDown("right"))
         {
             //move(2);
             this.setLocation(this.getX()+5,this.getY());
            }
            if(Greenfoot.isKeyDown("up"))
         {
             //move(2);
             this.setLocation(this.getX(),this.getY()-5);
            }
            if(Greenfoot.isKeyDown("down"))
         {
             //move(2);
             this.setLocation(this.getX(),this.getY()+5);
            }
            eatBanana();
    }   
     void eatBanana()
    {
        Actor getBanana =getOneIntersectingObject(Banana.class);
        if(getBanana !=null)
        {
            getWorld().removeObject(getBanana);

        }

    }

}
