package TaskHome;

public class Stork extends Bird implements BirdFly {

    public Stork(Integer height, Integer weight, String eyeColor, Integer flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах\n", super.getFlightAltitude());
    }

    @Override
    public void animalSound() {
        System.out.println("Я издаю звук: клювом ЩЕЛК-ЩЕЛК.");
    }

    @Override
    public void info() {
        System.out.println("Аист - это крупная перелётная птица, на высоких ногах,\n"+
        "с длинной шеей и длинным клювом. Масса её 3,5-4 кг, длина крыла 58-61 см.\n"+
        "Цвет оперения преимущественно белый, концы крыльев блестящие, чёрные. Клюв и ноги красные.\n"+
        "Эта птица не только не боится человека, но и охотно селится рядом с ним. С давних\n"+ 
        "времён люди верили, что, если во дворе поселились аисты, это к счастью. А тому,\n"+ 
        "кто разорит гнездо или убьёт птенцов, аист обязательно отомстит.\n");
    }
    @Override
    public String toString() {
        return "Аист: " + "рост: " + height + ", вес: " + weight+
       ",\n цвет глаз: " + eyeColor + ", Высота полёта: " + getFlightAltitude();
    }

}
