//RedheadDuck.java
package Assignment_6;

class RedheadDuck extends Duck 
{
    //constructor
    RedheadDuck(){
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
    
    @Override
    void display(){
        System.out.println("I'm a Redhead Duck");
    }
}
