package TaskHome;

public abstract class Animal {
    protected Integer height;
    protected Integer weight;
    protected String eyeColor;

    public Animal(Integer height, Integer weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void animalSound();

    public abstract void info();

    @Override
    public String toString() {
        return "Животное: " + "рост: " + height + ", вес: " + weight +
                ", цвет глаз: " + eyeColor;
    }
}
