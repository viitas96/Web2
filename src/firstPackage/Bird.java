package firstPackage;

public class Bird extends Animal {
    public void canFly(boolean bool){
        if (bool){
            System.out.println("I'm fyling bird");
        }
        else {
            System.out.println("I'm walking bird");
        }
    }
}
