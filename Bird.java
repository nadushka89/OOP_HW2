package TaskHome;

public abstract class Bird extends Animal implements BirdFly{
    private Integer flightAltitude;
    public Bird(Integer height, Integer weight, String eyeColor,Integer flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude=flightAltitude;
    }

    public Integer getFlightAltitude(){
        return flightAltitude;
    }

    public abstract void toFly();

    @Override
    public String toString() {
        return "Птица: " + "рост: " + height + ", вес: " + weight+
       ", цвет глаз: " + eyeColor + ", Высота полёта: " + flightAltitude;
    }
}
