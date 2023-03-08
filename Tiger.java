package TaskHome;


public class Tiger extends WildAnimal {

    public Tiger(Integer height, Integer weight, String eyeColor, String habitat, String dateOfLocation) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        
    }
    
    @Override
    public String toString() {
        return "Тигр : " + "рост: " + height + ", вес: " + weight+
       ",\n цвет глаз: " + eyeColor + ", место обитания: " + habitat + ", дата нахождения: " + dateOfLocation;
    }
    @Override
    public void animalSound() {
        System.out.println("Я издаю звук: РРРРРРРР");
    }
    @Override
    public void info() {
        System.out.println("Тигр — хищное млекопитающее из семейства кошачьих.\n"+
        "Он является третьим по величине наземным хищником, после белого и бурого \n"+
        "медведей. Длина его тела может достигать более трех метров, а масса – более 300 кг.\n"+
        "Длина хвоста – около 90 см. Самки, как правило, значительно меньше самцов.\n");
        
    }
}
