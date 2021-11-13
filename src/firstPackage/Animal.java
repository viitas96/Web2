package firstPackage;

public class Animal {
    public String rang;

    public boolean canDive;

    protected String name;

    public int numberOfLegs;

    public Animal(){
        this("", "", 4, false);
    }

    public Animal(String name, String rang, int numberOfLegs, boolean canDive){
        this.name = name;
        this.rang = rang;
        this.numberOfLegs = numberOfLegs;
        this.canDive = canDive;
    }
}
