package TaskHome;



public abstract class Pet extends Animal {

    protected String nickname;
    protected String breed;
    protected String vaccination;
    protected String coatColor;
    protected String dataOfBirths;

    public Pet(String nickname, String breed, String vaccination, String coatColor, String dataOfBirths,Integer height, Integer weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccination = vaccination;
        this.coatColor = coatColor;
        this.dataOfBirths = dataOfBirths;
    }

    public abstract void animalSound();

    public abstract void info();

    public abstract void caressing();

    public String toString() {
        return "Домашнее животное: " + "рост: " + height + ", вес: " + weight +
                ", цвет глаз: " + eyeColor + ", кличка: " + nickname + ", порода: " + breed + ", наличие прививок: " +
                vaccination + ", цвет шерсти: " + coatColor + ", дата рождения: " + dataOfBirths;
    }

}
