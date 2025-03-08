//RubberDuck.java
package Assignment_6;
class RubberDuck extends Duck 
{
    //constructor
    RubberDuck(){
        flyBehavior = new NotFly();
        swimBehavior = new Float();
    }
    
    @Override
    void display(){
        System.out.println("I'm a Rubber Duck");
    }
}
