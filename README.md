# SecAdnanceAssignment

- the problem of old class diagram:
  It’s very difficult, because we need a class that is a subclass of monster,
  but has the move of MonsterFast and the makeNoise and render of Monster Stealth.

-Solution:
 We have a player character class that contains the behavior of the players, 
 and the relationship between them is one-to-one.

 So that the Move class is Interface, and the Behaviour class is Interface.

 Interface Behaviour contains the Move function and the Make-Noise function,
 and it Extends from it all the classes that do not use the Move, 

 namely: 
  - The Player Class Behaviour. 
  - The Monster Class Behavior.  
  - The Monster Stealth Class Behavior.
