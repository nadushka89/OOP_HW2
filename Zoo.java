package TaskHome;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static ArrayList<Animal> allAnimal = new ArrayList<>();
    {
        allAnimal.add(new Cat("Мурзик", "Шотландский", "Привитый", "Серо-белый", "20.07.2019", 32, 10, "голубой",
                "пушистый"));
        allAnimal.add(new Chicken(50, 12, "желтые", 15));
        allAnimal.add(new Dog("Шарик", "Бигль", "Привитый", "Рыже-белый", "15.09.2017", 42, 15, "серый",
                "плохо поддается дрессировке"));
        allAnimal.add(new Stork(56, 18, "серый", 25));
        allAnimal.add(new Tiger(116, 300, "желтые", "Россия", "15.09.1997"));
        allAnimal.add(new Tiger(115, 295, "серый", "Индия", "15.09.1999"));
        allAnimal.add(new Wolf(65, 40, "желтый", "Россия", "15.09.2005", "Вожак"));

    }

    public int size() {
        return allAnimal.size()+1;
    }

    public void addCat(Scanner input) {
        String nickname;
        String breed;
        String vaccination;
        String coatColor;
        String dataOfBirths;
        Integer height;
        Integer weight;
        String eyeColor;
        String wool;
        System.out.print("Кличка: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print(" Наличие прививок: ");
        vaccination = input.next();
        System.out.print("Цвет шерсти: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        dataOfBirths = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Наличие шерсти: ");
        wool = input.next();
        Zoo.allAnimal
                .add(new Cat(nickname, breed, vaccination, coatColor, dataOfBirths, height, weight, eyeColor, wool));
    }

    public void addDog(Scanner input) {
        String nickname;
        String breed;
        String vaccination;
        String coatColor;
        String dataOfBirths;
        Integer height;
        Integer weight;
        String eyeColor;
        String availabilityOfTraining;
        System.out.print("Кличка: ");
        nickname = input.next();
        System.out.print("Порода: ");
        breed = input.next();
        System.out.print(" Наличие прививок: ");
        vaccination = input.next();
        System.out.print("Цвет шерсти: ");
        coatColor = input.next();
        System.out.print("Дата рождения: ");
        dataOfBirths = input.next();
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Наличие дресировки: ");
        availabilityOfTraining = input.next();
        Zoo.allAnimal.add(new Dog(nickname, breed, vaccination, coatColor, dataOfBirths, height, weight, eyeColor, availabilityOfTraining));
    }

    public void addChicken(Scanner input) {
        Integer height;
        Integer weight;
        String eyeColor;
        Integer flightAltitude;
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        flightAltitude = input.nextInt();
        Zoo.allAnimal.add(new Chicken(height, weight, eyeColor, flightAltitude));
    }

    public void addStork(Scanner input) {
        Integer height;
        Integer weight;
        String eyeColor;
        Integer flightAltitude;
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Высота полета: ");
        flightAltitude = input.nextInt();
        Zoo.allAnimal.add(new Stork(height, weight, eyeColor, flightAltitude));
    }

    public void addTiger(Scanner input) {
        Integer height;
        Integer weight;
        String eyeColor;
        String habitat;
        String dateOfLocation;
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        dateOfLocation = input.next();
        Zoo.allAnimal.add(new Tiger(height, weight, eyeColor, habitat, dateOfLocation));

    }

    public void addWolf(Scanner input) {
        Integer height;
        Integer weight;
        String eyeColor;
        String habitat;
        String dateOfLocation;
        String leader;
        System.out.print("Рост: ");
        height = input.nextInt();
        System.out.print("Вес: ");
        weight = input.nextInt();
        System.out.print("Цвет глаз животного: ");
        eyeColor = input.next();
        System.out.print("Место обитания: ");
        habitat = input.next();
        System.out.print("Дата обнаружения: ");
        dateOfLocation = input.next();
        System.out.print("Является вожаком стаи?: ");
        leader = input.next();
        Zoo.allAnimal.add(new Wolf(height, weight, eyeColor, habitat, dateOfLocation, leader));
    }

    void showAll() {
        int i = 1;
        for (Animal animal : allAnimal) {
            System.out.printf("%d) ", i);
            System.out.println(animal);
            System.out.println("---");
            i++;
        }
    }

    void removeAnimal(int number) {
        allAnimal.remove(number);
    }

    void showAnimal(int number) {
        System.out.println(allAnimal.get(number));
        if (allAnimal.get(number) instanceof Pet) {
           ((Pet)allAnimal.get(number)).caressing();
        }
        if (allAnimal.get(number) instanceof BirdFly) {
            ((BirdFly)allAnimal.get(number)).toFly();
        }
        if (allAnimal.get(number) instanceof showAffectionDog) {
            ((showAffectionDog)allAnimal.get(number)).showAffection();
        }
    }

    void animalSound(int number) {
        allAnimal.get(number).animalSound();
    }

    void allAnimalSound() {
        for (Animal animal : allAnimal) {
            animal.animalSound();
            System.out.println("---");
        }
    }
    void animalInfo(int number) {
        allAnimal.get(number).info();
    }
}
