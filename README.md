# Assignment 6 - Duck Simulation

Overview

This project demonstrates the Strategy Design Pattern using a Duck simulation, where different ducks have different flying and swimming behaviors.

# How to Run

Navigate to the project folder:

cd /path/to/ProjectFolder

Compile the code:

javac Assignment_6/*.java

run the program:

java Assignment_6.Main

# Expected Output

I'm a Mallard Duck
I can fly!
I can swim!

I'm a Redhead Duck
I can fly!
I can swim!

I'm a Rubber Duck
I cannot fly!
I am floating!

I'm a Decoy Duck
I cannot fly!
I am drowning!

# Structure

Duck.java: Abstract class defining fly and swim behaviors.

Main.java: Runs the simulation.

Behaviors:

Fly_behaviour: Fly, NotFly

Swim_behaviour: Swim, Float, Drown

Duck Types: MallardDuck, RedheadDuck, RubberDuck, DecoyDuck

# License

This project is for educational purposes. Modify as needed!

