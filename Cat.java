package TaskHome;


public class Cat extends Pet {
    private String wool;

    public Cat(String nickname, String breed, String vaccination, String coatColor, String dataOfBirths,
            Integer height, Integer weight, String eyeColor, String wool) {
        super(nickname, breed, vaccination, coatColor, dataOfBirths, height, weight, eyeColor);
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "Кошка: " + "рост: " + height + ", вес: " + weight +
                ",\n цвет глаз: " + eyeColor + ", кличка: " + nickname + ",\n порода: " + breed + ", наличие прививок: " +
                vaccination + ", \nцвет шерсти: " + coatColor + ", дата рождения: " + dataOfBirths + ", Наличие шерсти: "
                +
                wool;
    }

    @Override
    public void animalSound() {
        System.out.println("Я издаю звук: МЯУ");
    }

    @Override
    public void info() {
        System.out.println("Кошки очень симпатичные и грациозные животные. Эти животные\n" +
                "передвигаются на четырех лапах, хорошо прыгают и умеют забираться на деревья.\n" +
                "Большинство кошек покрыто мехом и имеют длинный хвост и торчащие ушки.\n" +
                "Эти животные могут быть дикими или домашними. Кошка-популярный домашний питомец.\n" +
                "Ее небольшие размеры позволяют держать кошку в доме или квартире.\n");
    }

    @Override
    public void caressing() {
        System.out.println(" Почеши мне за ушком, мурррр...");
    }

}
