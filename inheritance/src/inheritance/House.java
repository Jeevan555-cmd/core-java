
class House extends Buildings {
    int rooms = 5;
    public void info() {
        System.out.println("House has " + rooms + " rooms.");
    }

    public static void main(String[] args) {
        Buildings b = new Buildings();
        b.info();

        House h = new House();
        h.info();

        Buildings bh = new House();
        bh.info();
    }
}