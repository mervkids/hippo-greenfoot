import greenfoot.*;

/**
 * Write a description of class Hippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hippo extends Actor
{
    /**
     * Act - do whatever the Hippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        keyboard();
        atWorldEdge();
    } 

    void atWorldEdge()
    {
        if(getX() <= 10 || getX() >= getWorld().getWidth() -10);
        {
            turn(180);
        }
        if(getX() <= 10 || getX() >= getWorld().getWidth() -10);
        {
            turn(180);
        }

    }

    void eatBanana()
    {
        int i=0;
        Actor getBanana =getOneIntersectingObject(Banana.class);
        if(getBanana !=null)
        {
            getWorld().removeObject(getBanana);
            i++;

        }

    }

    void eatPoison()
    {
        Actor getPoison =getOneIntersectingObject(Poison.class);
        if(getPoison !=null)
        {
            Greenfoot.stop();
        }

    }

    void keyboard() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            this.setImage("hippo-left.png");
            this.setLocation(this.getX()-5,this.getY());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            this.setImage("hippo-right.png");
            this.setLocation(this.getX()+5,this.getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            this.setImage("hippo-up.png");
            this.setLocation(this.getX(),this.getY()-5);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            this.setImage("hippo-down.png");
            this.setLocation(this.getX(),this.getY()+5);
        }
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.playSound("gogogogo.wav");
        }
        eatBanana();
        eatPoison();
    }
}

