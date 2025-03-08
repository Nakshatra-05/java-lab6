//MallardDuck.java
package Assignment_6;

class MallardDuck extends Duck 
{
    //constructor
    MallardDuck(){
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
    
    @Override
    void display(){
        System.out.println("I'm a Mallard Duck");
    }
}
