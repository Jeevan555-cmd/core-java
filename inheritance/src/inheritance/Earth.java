
class Earth extends Planet {
    long population = 8000000000L;
    public void details() {
        System.out.println("Earth's population: " + population);
    }

    public static void main(String[] args) {
        Planet p = new Planet();
        p.details();

        Earth e = new Earth();
        e.details();

        Planet pe = new Earth();
        pe.details();
    }
}