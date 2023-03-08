package TaskHome;

public class Chicken extends Bird implements BirdFly{

    public Chicken(Integer height, Integer weight, String eyeColor, Integer flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
        
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на %d метрах\n", super.getFlightAltitude());
    }

    @Override
    public void animalSound() {
        System.out.println("Я издаю звук: КУД-КУДА.");
    }

    @Override
    public void info() {
        System.out.println("Курица - один самых популярных и распространенных видов домашней птицы.\n"+ 
        "Сейчас около 80% всех домашних птиц составляют куры. Куры живут в курятниках или на больших\n"+ 
        "птицефермах.  Выведено множество пород различного направления: яичные, мясные, бойцовые,\n"+ 
        "декоративные и другие. Официально зарегистрировано около 200 пород домашних кур, но на самом\n"+ 
        "деле их больше.\n");
    }

    @Override
    public String toString() {
        return "Курица: " + "рост: " + height + ", вес: " + weight+
       ", \nцвет глаз: " + eyeColor + ", Высота полёта: " + getFlightAltitude();
    }

    
}
