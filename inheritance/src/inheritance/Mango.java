class Mango extends Fruits {
    String color = "Yellow";
    int price = 70;

    public void show() {
        System.out.println("Mango taste: " + taste + ", price: " + price);
    }

    public void display() {
        System.out.println("Color of mango: " + color);
    }

    public static void main(String[] args) {
        Fruits f = new Fruits();
        f.show();

        Mango m = new Mango();
        m.show();
        m.display();

        Fruits fm = new Mango();
        fm.show();
    }
}
