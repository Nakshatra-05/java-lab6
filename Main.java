//Main.java
package Assignment_6;

public class Main 
{
    public static void main(String[] args) 
    {
        Duck[] ducks = {new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};
        
        for (Duck duck : ducks){
            duck.display();
            duck.performFly();
            duck.performSwim();
            System.out.println();
        }
    }    
}
