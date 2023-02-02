abstract class Food {
    void printFlavor() {}
}
class Pepper extends Food {}
public class Lunch {
    public static void main(String[] args) {
        Food lunch = new Pepper();
        lunch.printFlavor();
    }
}
