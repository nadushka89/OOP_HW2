package TaskHome;


public abstract class WildAnimal extends Animal {

    protected String habitat;
    protected String dateOfLocation;

    public WildAnimal(Integer height, Integer weight, String eyeColor,String habitat, String dateOfLocation) {
        super(height, weight, eyeColor);
        this.habitat=habitat;
        this.dateOfLocation=dateOfLocation; 
    }

    @Override
    public  abstract void animalSound();

    @Override
    public abstract void info();
    
    @Override
    public String toString() {
        return "Дикое животное: " + "рост: " + height + ", вес: " + weight+
       ", цвет глаз: " + eyeColor + ", место обитания: " + habitat + ", дата нахождения: " + dateOfLocation;
    }
    
}
