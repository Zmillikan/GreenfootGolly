import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
/**
 * Initialize world
 * Act()
 *    Generate World
 *    Draw world
 */

 private boolean[][] world = new boolean[500][500];
 private boolean[][] tempworld = world;
 private int nearby = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        randomize();
        draw();
    }
    
    public void act() {
        generate();
        draw();
        
    }
    
    /**
     * Randomize world of cells
     */
    public void randomize() {
        for (int i = 0; i<500;i++) {
            for (int j = 0; j<500;j++) {
                // Populate world
                if(Math.random()<.2) {
                    world[i][j] = true;
                }
                else {
                world[i][j] = false;
            }
        }
    }
}
    
/**
     * Draw (display) world
     */
    
    public void draw()
    {
        Color black = Color.black;
        GreenfootImage b = getBackground();
        b.setColor(Color.white);
        b.fill();
        for(int i=0;i<500;i++) {
            for(int j=0;j<500;j++) {
                 if(world[i][j]) {
                     b.setColorAt(i,j,black); }
                }
            }
    }
    
    public void generate()
    {
        for (int y = 1; y <= 498; y++)
        {
            for (int x = 1; x <= 498; x++)
            {
                nearby = calculation(x,y);
                
                if (nearby < 2 || nearby > 3)
                {
                    world[x][y] = false;
                }
                else if (nearby == 3)
                {
                    world[x][y] = true;
                }
                
                else 
                {
                    world[x][y] = tempworld[x][y];
                }
            }
        }
    }
    
    public int calculation (int xlocation, int ylocation)
    {
        nearby = 0;
        for (int y = ylocation - 1; y <= ylocation + 1; y++)
        {
            for (int x = xlocation - 1; x <= xlocation + 1; x++)
            {
                if (x != xlocation || y != ylocation)
                {
                   if(tempworld[x][y] == true)
                   {
                    nearby++;
                   }
                }
            }
        }
        
        return nearby;
    }
    
}
