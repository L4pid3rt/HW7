public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Bars", 10),
                new Cat("Pushok", 15),
                new Cat("Tigr", 10),
                new Cat("Amur", 10),
                new Cat("Belyash", 5)
        };
        Plate plate = new Plate(45);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();
        plate.increaseFood(30);
        plate.info();
    }
}