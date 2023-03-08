package TaskHome;


public class Dog extends Pet implements showAffectionDog{
    private String availabilityOfTraining;

    public Dog(String nickname, String breed, String vaccination, String coatColor, String dataOfBirths,
            Integer height, Integer weight, String eyeColor, String availabilityOfTraining) {
        super(nickname, breed, vaccination, coatColor, dataOfBirths, height, weight, eyeColor);
        this.availabilityOfTraining = availabilityOfTraining;
    }

    public String toString() {
        return "Собака: " + "рост: " + height + ", вес: " + weight +
                ", \nцвет глаз: " + eyeColor + ", кличка: " + nickname + ", порода: " + breed + ", наличие прививок: " +
                vaccination + ",\n цвет шерсти: " + coatColor + ", дата рождения: " + dataOfBirths
                + ", \nНаличие дрессировки: " +
                availabilityOfTraining;
    }

    public void showAffection() {
        System.out.println("я пошла дрессироваться\n");
    }

    public void animalSound() {
        System.out.println("Я издаю звук: ГАВ");
    }

    public void info() {
        System.out.println("Собака - это домашнее животное. У собаки острые зубы,\n" +
                "поэтому она может очень легко есть мясо, у нее четыре ноги, два уха, два глаза,\n" +
                "хвост, рот и нос. Это очень умное животное и очень полезно для ловли воров.\n " +
                "Она бежит очень быстро, громко лает и нападает на незнакомцев. Собака спасает\n" +
                "жизнь хозяина от опасности. Собак можно найти повсюду в мире. Они очень верные \n" +
                "животные. У них острый ум и сильное чувство обоняния.\n");
    }

    @Override
    public void caressing() {
        System.out.println(" Почеши мне пузико ");
    }

}
