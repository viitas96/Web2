package firstPackage;

public class Main {
    public static void main(String[] args) {
        Square newSquare = new Square();
        newSquare.setSide(5);
        System.out.println(newSquare.area());

        Animal penguin = new Animal("Emperor Penguin", "Spheniscidae", 2, true);
        System.out.println(penguin.canDive);
        System.out.println(penguin.name);

        Bird swallow = new Bird();
        swallow.canDive = false;
        swallow.name = "Swallow";
        swallow.canFly(true);
    }
}
