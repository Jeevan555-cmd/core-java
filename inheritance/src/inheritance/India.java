
class India extends Country {
    String capital = "New Delhi";
    public void info() {
        System.out.println("India's capital is " + capital);
    }

    public static void main(String[] args) {
        Country c = new Country();
        c.info();

        India i = new India();
        i.info();

        Country ci = new India();
        ci.info();
    }
}