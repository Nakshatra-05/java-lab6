package Assignment_6;

class DecoyDuck extends Duck 
{
    //constructor
    DecoyDuck(){
        flyBehavior = new NotFly();
        swimBehavior = new Drown();
    }
    
    @Override
    void display(){
        System.out.println("I'm a Decoy Duck");
    }
}
