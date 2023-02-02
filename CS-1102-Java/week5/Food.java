class Food {
    Food() { printFlavor(); }
    void printFlavor() { System.out.println("bland"); }
}
class Pepper extends Food {
    void printFlavor() { System.out.println("spicy"); }
}
