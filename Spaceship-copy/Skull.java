// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Skull extends Actor
{

    /**
     * Act - do whatever the Skull wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turn(2);
        if (Greenfoot.getRandomNumber(10) < 5) {
            turn(-5);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
}
