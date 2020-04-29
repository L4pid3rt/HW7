public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n, String name) {
        if (food - n >= 0) {
            food -= n;
            System.out.println("Кот " + name + " съел " + n + " единиц еды");
            return true;
        } else {
            System.out.println("Невозможно покормить кота " + name +", мало корма");
            return false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void increaseFood(int n) {
        food += n;
    }
}
