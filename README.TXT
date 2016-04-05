------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Conway Game of Life
PURPOSE OF PROJECT: Simulate cell life
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

Define the initial variable for the world. 
	Multidimensional Array.  What datatype?
Randomly populate the world. Cells are either alive or dead.

The act() method runs the simulation. During act() you should:
  Generate a new world based on the current world
  (See rules)
  Replace current world with new world
  Display the current world

Conway’s Game of Life rules.
From generation to generation, a cell lives or dies based on these rules.

 if(neighbors < 2||neighbors > 3)
                cell dies;
 else if(neighbors == 3)
		 cell lives;
 else cell stays the same;