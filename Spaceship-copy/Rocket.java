// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Rocket here.
 * @author (your name) @version (a version number or a date)
 */
public class Rocket extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* Add your action code here.*/
        if (Greenfoot.isKeyDown("W")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-5);
        }
    }
}
