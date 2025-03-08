//Duck.java
package Assignment_6;

//Duck superlass
abstract class Duck 
{
    Fly_behaviour flyBehavior;
    Swim_behaviour swimBehavior;
    
    void performFly(){
        flyBehavior.fly();
    }
    
    void performSwim(){
        swimBehavior.swim();
    }
    
    abstract void display();
}
