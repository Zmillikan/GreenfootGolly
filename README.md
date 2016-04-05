# GreenfootGolly
Conway "Game of Life" implementation on Greenfoot  

##Steps:
Define the initial variable for the world.   
	Multidimensional Array.    
	What datatype?

Randomly populate the world. (Cells are either alive or dead.)


The act() method runs the simulation.

  Generate a new world based on the current world  
  (See rules)  
  Replace current world with new world  
  Display the current world  

###Conway’s Game of Life rules.  
From generation to generation, a cell lives or dies based on these rules.

 if(neighbors < 2||neighbors > 3)  
	 cell dies;  
 else if(neighbors == 3)  
	 cell lives;  
 else cell stays the same;  