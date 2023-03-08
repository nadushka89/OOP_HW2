package TaskHome;


public class Wolf extends WildAnimal {
    private String leader;

    public Wolf(Integer height, Integer weight, String eyeColor, String habitat, 
    String dateOfLocation,String leader) {
        super(height, weight, eyeColor, habitat, dateOfLocation);
        this.leader=leader;
    }
    @Override
    public String toString() {
        return "Волк: " + "рост: " + height + ", вес: " + weight+
       ",\n цвет глаз: " + eyeColor + ", место обитания: " + habitat + ", дата нахождения: " + dateOfLocation+
       ",\n  Вожак стаи: " + leader;
    }
    @Override
    public void animalSound() {
        System.out.println("Я издаю звук: УУУУУУ");
    }
    @Override
    public void info() {
        System.out.println("Волк - хищник, который живёт в лесах. Раньше они жили почти\n"+
        "по всему миру, но сейчас их стало намного меньше. Внешне волки похожи на больших\n "+
        "собак с сильным, мускулистым телом и высокими ногами.Размеры и вес волков зависят\n "+
        "от местности, в которой они обитают, чем ближе к северу, тем крупнее животное.\n "+
        "Обычно самцы больше самок. В среднем их высота колеблется от 60 до 85 см, \n"+
        "длина головы и тела 100 – 160 см, длина хвоста 35 – 56 см. Вес самок 18 – 55 кг,\n "+
        "у самцов 20 – 80 кг.\n");
    }
}
