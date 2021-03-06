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
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,240,215);

        Skull skull = new Skull();
        addObject(skull,525,262);
        Skull skull2 = new Skull();
        addObject(skull2,429,172);

        Rhino rhino = new Rhino();
        addObject(rhino, getWidth() / 2, getHeight() / 2);

        Ballon ballon = new Ballon();
        addObject(ballon, 42, getHeight() - 30);
        //Banana banana = new Banana();
        //addObject(banana,404,310);
        
    }
}
